package com.week5;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// ActionListener al = new DeptManager();
//자바는 단일 상속만 가능하다.- 다중상속은 불가함 - 다중상속의 단점을 보완하기 위해 인터페이스가 제공됨
//단 인터페이스는 여러개를 implements할 수 있다.(추상클래스, 인터페이스는 설계관점에서 중요함 - 특징, 컨벤션)
public class DeptManager extends JFrame implements ActionListener{
	//선언부
	List<DeptDTO> deptList = new ArrayList<>();//왜 전역변수로 하는가? 입력|수정|삭제|조회
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[0][0];//2차배열 - 대괄호가 2쌍이 필요함
	//생성자의 파라미터를 통해서 서로 다른 클래스가 의존관계를 맺고 하나의 기능을 서비스 할 수  있다.
	//생성자도 파라미터를 여러개 갖을 수 있다. - 메소드 오버로딩
	DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);//<table>-양식  자바가 있어야 DataSet구성함
	JTable jt_dept = new JTable(dtm_dept);
	JScrollPane jsp_dept = new JScrollPane(jt_dept);
	JPanel jp_north = new JPanel();
	JButton jbtnSelect = new JButton("조회");
	JButton jbtnAdd = new JButton("행추가");
	JButton jbtnDel = new JButton("행삭제");
	JButton jbtnExit = new JButton("종료");
	//생성자
	DeptManager(){
		getDeptList();
		initDisplay();
	}////////////// end of DeptManager
	public List<DeptDTO> getDeptList(){
		DeptDTO dept = new DeptDTO(10,"영업부","부산");
		deptList.add(dept);
		dept = new DeptDTO(20,"개발부","대전");
		deptList.add(dept);
		dept = new DeptDTO(30,"운영부","인천");
		deptList.add(dept);
		return deptList;
	}
	//화면 처리부
	public void initDisplay() {
		jbtnSelect.addActionListener(this);
		jbtnSelect.addActionListener(this);
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jbtnSelect);
		jp_north.add(jbtnAdd);
		jp_north.add(jbtnDel);
		jp_north.add(jbtnExit);
		this.add("North", jp_north);
		this.add("Center", jsp_dept);
		this.setSize(500, 400);//this:DeptManager
		this.setVisible(true);
	}//////////// end of initDisplay  /////////////
	//메인 메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		DeptManager dm = new DeptManager();//new JFrame()호출되는 것이다.
	}//////////////// end of main ////////////////
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed호출은 반드시 addActionListener가 있어야 됨");
		Object obj = e.getSource();
		//너 조회버튼 누른거야?
		if(obj == jbtnSelect) {
			System.out.println("조회버튼 클릭");//log
			while(dtm_dept.getRowCount()>0) // why? - dtm은 데이터를 받아오는 역할을 한다 JTable은 데이터를 쥐고 있지는 못함
			{
				dtm_dept.removeRow(0);
			}
			for(int i = 0; i<deptList.size(); i++)
			{
				Vector<Object> v = new Vector<>();
			}
			
		}
		}////////////////// end of if ///////////////
		
	}///////////////////// end of actionPerformed


}