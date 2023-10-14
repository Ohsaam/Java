package com.step5;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// ActionListener al = new DeptManager();
//자바는 단일 상속만 가능하다.- 다중상속은 불가함 - 다중상속의 단점을 보완하기 위해 인터페이스가 제공됨
//단 인터페이스는 여러개를 implements할 수 있다.(추상클래스, 인터페이스는 설계관점에서 중요함 - 특징, 컨벤션)
public class DeptManager2 extends JFrame implements ActionListener{
	//선언부
	List<DeptDTO> deptlist = new ArrayList<>();
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[0][0];//2차배열 - 대괄호가 2쌍이 필요함
	//생성자의 파라미터를 통해서 서로 다른 클래스가 의존관계를 맺고 하나의 기능을 서비스 할 수  있다.
	//생성자도 파라미터를 여러개 갖을 수 있다. - 메소드 오버로딩
	DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);//<table>-양식  자바가 있어야 DataSet구성함
	JTable jt_dept = new JTable(dtm_dept);
	JScrollPane jsp_dept = new JScrollPane(jt_dept);
	JPanel jp_north = new JPanel();
	JButton jbtnSelect = new JButton("조회");
	JButton jbtnSAKJE = new JButton("삭제");
	JButton jbtnAdd = new JButton("행추가");
	JButton jbtnDel = new JButton("행삭제");
	JButton jbtnExit = new JButton("종료");
	//생성자
	DeptManager2(){
		// 생성자의 역할 중 하나가 전역변수를 초기화 시키는 것. 그렇기 떄문에 -> 생성자 호출되면 걸쳤다가 -> 전역변수 들리고 -> 내부를 돈다.
		getDeptList();
		initDisplay();
	}////////////// end of DeptManager

	/*
	 * deptlist에 DeptDTO 값을 넣어야지 -> 계속 메소드를 사용하면서 재활용 하고 싶어 how?
	 */
	public List<DeptDTO> getDeptList()
	{
		// DeptDTO가 필요한 이유는 값을 set해야 되기 때문이다. -> 그래야지 밑에 조회를 눌렀을 때 값이 뜬다.
		// 언제까지 set 써서 값 넣을래 -> 할 수 있는 방법이 있다. -> 생성자에다가 처음에 대입할 때 하면  된다.
		DeptDTO deptDTO = new DeptDTO(20,"오지환","인천");
		// add 해야지 -> 또 "재정의" 해서 -> 하게 되면 업데이트가 된다.
		deptlist.add(deptDTO);// 0번 인덱스에 해당 값이 저장된다. -> 이 줄이 넘어가면 1번 인덱스로 바뀌게 된다
		deptDTO = new DeptDTO(23,"김수진","서울");
		deptlist.add(deptDTO);
		deptDTO = new DeptDTO(25,"김유진","성남");
		deptlist.add(deptDTO);
		
		return deptlist;
		/*
		 * 20,"오지환","인천" --> 0
		 * 23,"김수진","서울" --> 1
		 * 25,"김유진","성남" --> 2
		 */
		
		
	}
	
	
	//화면 처리부
	public void initDisplay() {
		jbtnSelect.addActionListener(this);
		jbtnAdd.addActionListener(this);
		jbtnDel.addActionListener(this);
		jbtnExit.addActionListener(this);
		jbtnSAKJE.addActionListener(this);
		
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jbtnSelect);
		jp_north.add(jbtnAdd);
		jp_north.add(jbtnDel);
		jp_north.add(jbtnExit);
		jp_north.add(jbtnSAKJE);
		
		this.add("North", jp_north);
		this.add("Center", jsp_dept);
		this.setSize(500, 400);//this:DeptManager
		this.setVisible(true);
	}//////////// end of initDisplay  /////////////
	//메인 메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		DeptManager2 dm = new DeptManager2();//new JFrame()호출되는 것이다.
	}//////////////// end of main ////////////////
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed호출은 반드시 addActionListener가 있어야 됨");
		Object obj = e.getSource();
		
		if(obj == jbtnSAKJE)
		{
			int index = jt_dept.getSelectedRow();
			
			if(index < 0)
			{
				System.out.println("index가 0 이하이입니다.");
			}
			else {
				// 리스트에서 값을 제거해야함. 그래야 값이 빠짐 
				deptlist.remove(index);
				refresh();
			}
			
		}
		

		//너 조회버튼 누른거야?
		else if(obj == jbtnSelect) {
		while(dtm_dept.getRowCount()>0)
		{
			dtm_dept.removeRow(0);
		}
		for(int i = 0; i<deptlist.size(); i++)
		{
			// 값을 테이블에 저장을 해야 된다.
			/*---새로고침 시나리오1------
			 * 전역변수로 선언 된 deptlist 를 끌어다가 DeptDTO 라는 변수를 하나 선언해서 값을 담은 다음
			 * Vector 객체를 하나 만든다음 그 값들을 Vector에다 추가 -> dtm_dept.row에 추가
			 */
			DeptDTO redept = deptlist.get(i);
			Vector<Object> v = new Vector(); // Object로 하는 이유가   dtm_dept로 받을 수 있는 파라미터가 addrow(object[], int)이기 떄문이다.
			v.add(0,redept.getDeptno());
			v.add(1,redept.getDname());
			v.add(2,redept.getLoc());
			dtm_dept.addRow(v);
			
		}
		
		

			
			
		}////////////////// end of if ///////////////
		
		
	}///////////////////// end of actionPerformed
	
	public void refresh() // 새로고침하는 메소드 
	{
		while(dtm_dept.getRowCount()>0)
		{
			dtm_dept.removeRow(0);
		}
		for(int i = 0; i<deptlist.size(); i++)
		{
			// 값을 테이블에 저장을 해야 된다.
			/*---새로고침 시나리오1------
			 * 전역변수로 선언 된 deptlist 를 끌어다가 DeptDTO 라는 변수를 하나 선언해서 값을 담은 다음
			 * Vector 객체를 하나 만든다음 그 값들을 Vector에다 추가 -> dtm_dept.row에 추가
			 */
			DeptDTO redept = deptlist.get(i);
			Vector<Object> v = new Vector(); // Object로 하는 이유가   dtm_dept로 받을 수 있는 파라미터가 addrow(object[], int)이기 떄문이다.
			v.add(0,redept.getDeptno());
			v.add(1,redept.getDname());
			v.add(2,redept.getLoc());
			dtm_dept.addRow(v);
			
		}
	}


}
