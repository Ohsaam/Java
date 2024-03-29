package crudProject;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class LunchManageGUIApp extends JFrame implements ActionListener { 
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField phoneTF;
	private JTextField addressTF;
	private JTextField distanceTF;
	private JTextField memoTF;
	private JTextField searchNTF;
	private JTextField searchTTF;

	JButton createButton, updateButton, deleteButton, cancelButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LunchManageGUIApp frame = new LunchManageGUIApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LunchManageGUIApp() {
		setResizable(false);
		setTitle("\uB9DB\uC9D1 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JTable 
		String[] columnNames={"이름","전화번호","주소","거리","메모"};
		String[][] rowData={};
		
		DefaultTableModel tableModel=new DefaultTableModel(rowData, columnNames);
		
		table=new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uC774\uB984", "\uC804\uD654\uBC88\uD638", "\uC8FC\uC18C", "\uAC70\uB9AC", "\uBA54\uBAA8"
			}
		));
		table.setShowGrid(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
		// 테이블 내용 가운데 정렬하기
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러 생성 (가운데 정렬을 위한)
		// Renderer의 정렬을 가운데 정렬로 지정
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		
		//정렬할 테이블의 ColumnModel을 가져옴 
		TableColumnModel tcm = table.getColumnModel();
		
		/*		 
		//반복문을 이용 전체 열에 지정
		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
			}
		 */
		
		//특정 열에 지정
		tcm.getColumn(0).setCellRenderer(dtcr);  
		tcm.getColumn(1).setCellRenderer(dtcr);  
		tcm.getColumn(2).setCellRenderer(dtcr);  
	    tcm.getColumn(3).setCellRenderer(dtcr);
		//table.getColumnModel().getColumn(4).setMaxWidth(100);
		
		JScrollPane pane_table=new JScrollPane(table);
		pane_table.setSize(571, 252);
		pane_table.setLocation(206, 86);
		table.setBounds(200, 96, 554, 228);
		
		getContentPane().add(pane_table, BorderLayout.CENTER);
			
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 5, 755, 383);
		contentPane.add(panel_2);
		
		createButton = new JButton("\uC815\uBCF4 \uC800\uC7A5");
		createButton.setBounds(275, 15, 93, 36);
		createButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(createButton);
		
		updateButton = new JButton("\uC815\uBCF4 \uBCC0\uACBD");
		updateButton.setBounds(380, 15, 93, 36);
		updateButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.add(updateButton);
		
		deleteButton = new JButton("\uC815\uBCF4 \uC0AD\uC81C");
		deleteButton.setBounds(485, 15, 93, 36);
		deleteButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.add(deleteButton);
		
		cancelButton = new JButton("맛집검색");
		cancelButton.setBounds(590, 15, 93, 36);
		cancelButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.add(cancelButton);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 201, 383);
		panel_2.add(panel);
		
		JLabel nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		nameLabel.setBounds(11, 30, 57, 15);
		panel.add(nameLabel);
		
		JLabel phoneLabel = new JLabel("\uC804\uD654\uBC88\uD638");
		phoneLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		phoneLabel.setBounds(11, 65, 57, 15);
		panel.add(phoneLabel);
		
		JLabel addressLabel = new JLabel("\uC8FC\uC18C");
		addressLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		addressLabel.setBounds(11, 100, 57, 15);
		panel.add(addressLabel);
		
		JLabel distanceLabel = new JLabel("\uAC70\uB9AC");
		distanceLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		distanceLabel.setBounds(11, 135, 57, 15);
		panel.add(distanceLabel);
		
		JLabel memoLabel = new JLabel("\uBA54\uBAA8");
		memoLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		memoLabel.setBounds(11, 170, 57, 15);
		panel.add(memoLabel);
		
		JLabel searchNTFLabel = new JLabel("\uC774\uB984 \uAC80\uC0C9");
		searchNTFLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		searchNTFLabel.setBounds(11, 305, 57, 15);
		panel.add(searchNTFLabel);
		
		JLabel searchTTFLabel = new JLabel("\uAC70\uB9AC \uAC80\uC0C9");
		searchTTFLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		searchTTFLabel.setBounds(11, 335, 57, 15);
		panel.add(searchTTFLabel);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(62, 27, 116, 21);
		panel.add(nameTF);
		
		phoneTF = new JTextField();
		phoneTF.setColumns(10);
		phoneTF.setBounds(62, 62, 116, 21);
		panel.add(phoneTF);
		
		addressTF = new JTextField();
		addressTF.setColumns(10);
		addressTF.setBounds(62, 97, 116, 21);
		panel.add(addressTF);
		
		distanceTF = new JTextField();
		distanceTF.setColumns(10);
		distanceTF.setBounds(62, 132, 116, 21);
		panel.add(distanceTF);
		
		memoTF = new JTextField();
		memoTF.setColumns(10);
		memoTF.setBounds(62, 167, 116, 120);
		panel.add(memoTF);
		
		searchNTF = new JTextField();
		searchNTF.setColumns(10);
		searchNTF.setBounds(62, 302, 116, 21);
		panel.add(searchNTF);
		
		searchTTF = new JTextField();
		searchTTF.setColumns(10);
		searchTTF.setBounds(62, 332, 116, 21);
		
		panel.add(searchTTF);
		
		createButton.addActionListener(this);
		updateButton.addActionListener(this);
		deleteButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		displayAllLunchManage(0,null);
	}
	
	
	//테이블에 저장된 모든 정보를 검색하여 JTable 컴퍼넌트에 출력하는 메소드, 6월 21일-22일 
	public void displayAllLunchManage(int mode,String temp) {
		List<LunchManageDTO> lunchmanagerList=null;
		if(mode == 0) {
			lunchmanagerList=LunchManageDAO.getDAO().selectAllLunchManagerList();
		} else if(mode==1) {
			lunchmanagerList=LunchManageDAO.getDAO().selectNameManageList(temp);
		} else  if(mode==2) {
			lunchmanagerList=LunchManageDAO.getDAO().selectDistanceLunchManageList(temp);
		}
		
		if (lunchmanagerList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "저장된 맛집정보가 없습니다.");
			return;
		}
		
		DefaultTableModel model=(DefaultTableModel)table.getModel(); 
		
		for (int i = model.getRowCount(); i >0; i--) {
			model.removeRow(0);
		}	
		//JTable 컴퍼넌트에 반환받은 학생정보를 출력 
		for(LunchManageDTO lunchmanage:lunchmanagerList) {
			Vector<Object> rowData=new Vector<Object>();
			rowData.add(lunchmanage.getName());
			rowData.add(lunchmanage.getPhone());
			rowData.add(lunchmanage.getAddress());
			rowData.add(lunchmanage.getDistance());
			rowData.add(lunchmanage.getMemo());
			model.addRow(rowData);
		}
	}
	
	//JTextField 컴퍼넌트로 입력된 학생정보를 제공받아 LUNCHMANAGE 테이블에 저장하는 메소드 - '정보 저장'
	public void createLunchManage() {
		String name=nameTF.getText(); 
		
		if (name.equals("")) { //입력값 없는 경우 
			JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요");
			nameTF.requestFocus();
			return;
		}
		
		String nameReg="[가-힣]{2,7}";//정규표현식
		if(!Pattern.matches(nameReg, name)) {
			JOptionPane.showMessageDialog(this, "이름은 2~5 범위의 한글만 입력해 주세요.");
			nameTF.requestFocus();
			return;
		}
		
		String phone=phoneTF.getText();
		
		if (phone.equals("")) {
			JOptionPane.showMessageDialog(this, "전화번호를 반드시 입력해 주세요");
			phoneTF.requestFocus();
			return;
		}
		
		String phoneReg="\\d{2,3}-\\d{3,4}-\\d{4}";
		if(!Pattern.matches(phoneReg, phone)) {
			JOptionPane.showMessageDialog(this, "전화번호를 형식에 맞게 입력해 주세요.");
			phoneTF.requestFocus();
			return;
		}
		
		String distance=distanceTF.getText();
		
		if (distance.equals("")) {
			JOptionPane.showMessageDialog(this, "거리를 반드시 입력해 주세요");
			distanceTF.requestFocus();
			return;
		}
		
		String address=addressTF.getText(); //유효성 검사 안해줘도 있어야 함 
		String memo=memoTF.getText();
		
		//컴퍼넌트 입력값으로 필드값 변경
		LunchManageDTO lunchmanage=new LunchManageDTO();
		lunchmanage.setName(name);
		lunchmanage.setPhone(phone);
		lunchmanage.setAddress(address);
		lunchmanage.setDistance(distance);
		lunchmanage.setMemo(memo);
		
		//정보를 전달하여 저장하기 위해 DAO 클래스 호출 
		int rows=LunchManageDAO.getDAO().insertLunchManage(lunchmanage);
		
		JOptionPane.showMessageDialog(this, rows+"개의 맛집 정보를 저장하였습니다.");
		
		displayAllLunchManage(0,null);
		//initDisplay();
		
	}
	
	//이름제공, 학생정보 삭제 - '정보 삭제'
	public void deleteLunchManage() {
		String name=nameTF.getText(); 
		
		if (name.equals("")) {
			JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요");
			nameTF.requestFocus();
			return;
		}
				
		int rows=LunchManageDAO.getDAO().deleteLunchManage(name);
		
		if(rows>0) {
			JOptionPane.showMessageDialog(this,rows+"개의 맛집정보를 삭제하였습니다.");
			displayAllLunchManage(0,null);
		} else {
			JOptionPane.showMessageDialog(this, "삭제하고자 하는 이름의 맛집정보가 없습니다.");
		}
		//initDisplay();
	}
		
	
	//학생정보 제공, 학생정보 변경 - '정보 변경'
	public void updateLunchManage() {
		//변경하기 위해서 modify
		//int no=Integer.parseInt(noTF.getText());
		
		String name=nameTF.getText();
		
		if(name.equals("")) {//입력값이 없는 경우
			JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요.");
			nameTF.requestFocus();//입력촛점을 이동하는 메소드
			return;
		}
		
		String nameReg="[가-힣]{2,7}";//정규표현식
		if(!Pattern.matches(nameReg, name)) {//정규표현식과 입력값의 형식이 다른 경우
			JOptionPane.showMessageDialog(this, "이름은 2~5 범위의 한글만 입력해 주세요.");
			nameTF.requestFocus();
			return;
		}
		
		String phone=phoneTF.getText();
		
		if(phone.equals("")) {//입력값이 없는 경우
			JOptionPane.showMessageDialog(this, "전화번호를 반드시 입력해 주세요.");
			phoneTF.requestFocus();//입력촛점을 이동하는 메소드
			return;
		}
		
		String phoneReg="\\d{2,3}-\\d{3,4}-\\d{4}"; //정규표현식
		if(!Pattern.matches(phoneReg, phone)) {//정규표현식과 입력값의 형식이 다른 경우
			JOptionPane.showMessageDialog(this, "전화번호를 형식에 맞게 입력해 주세요.");
			phoneTF.requestFocus();
			return;
		}
		
		String address=addressTF.getText();
		
		if(address.equals("")) {//입력값이 없는 경우
			JOptionPane.showMessageDialog(this, "주소를 반드시 입력해 주세요.");
			addressTF.requestFocus();//입력촛점을 이동하는 메소드
			return;
		}
		
		String distance=distanceTF.getText();
		
		if (distance.equals("")) {
			JOptionPane.showMessageDialog(this, "거리를 반드시 입력해 주세요");
			distanceTF.requestFocus();
			return;
		}
		
		String memo=memoTF.getText();
		
		//DTO 인스턴스를 생성하고 컴퍼넌트의 입력값으로 필드값 변경
		LunchManageDTO lunchmanage = new LunchManageDTO();
		lunchmanage.setName(name);
		lunchmanage.setPhone(phone);
		lunchmanage.setAddress(address);
		lunchmanage.setDistance(distance);
		lunchmanage.setMemo(memo);
		
		//학생정보를 전달하여 STUDENT 테이블에 저장된 기존 학생정보를 변경하는 DAO 클래스의
		//메소드 호출
		int rows=LunchManageDAO.getDAO().updateLunchManage(lunchmanage);
		
		JOptionPane.showMessageDialog(this, rows+"명의 학생정보를 변경 하였습니다.");
		
		displayAllLunchManage(0,null);
		//initDisplay();
	}
		
	@Override
	public void actionPerformed(ActionEvent ev) {
		// 메소드 호출 
		Component c = (Component) ev.getSource();
		if (c == createButton) {
			createLunchManage();
		} else if (c == deleteButton) {
			deleteLunchManage();
		} else if (c == updateButton ) {
			updateLunchManage();
		} else if (c == cancelButton) {
			String name=searchNTF.getText();
			String distance=searchTTF.getText();
			
			if(!name.equals("")) {
				searchNTF.setText("");
				displayAllLunchManage(1,name);

			} else if(!distance.equals("")) {
				searchTTF.setText("");
				displayAllLunchManage(2,distance);

			} else {
				displayAllLunchManage(0,null);
			}
		}	
	}
}