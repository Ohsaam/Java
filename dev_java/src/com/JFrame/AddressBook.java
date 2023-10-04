package com.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//ActionListener는 인터페이스이라서 추상메소드를 가지고 있다.
// 추상메소드란 선언만 되어있고, (); 선언해야함 
public class AddressBook implements ActionListener{
	
	// 선언부

	JFrame jf = new JFrame();
	AddressDialog aDialog = new AddressDialog();
	JPanel jp_north = new JPanel();
	JButton btnSelect = new JButton("조회");
	JButton btnInsert = new JButton("입력");
	JButton btnUpdate = new JButton("수정");
	JButton btnDelete = new JButton("삭제");


	// 생성자
	public AddressBook()
	{
		
	}
	
	// 이벤트처리 3단계 
	/*
	 * 1. 버튼의 이벤트를 지원하는 인터페이스를  implements한다. 현재는 ActionListener 사용한다.
	 * 2. 해당 인터페이스가 선언하고 있는 메소드를 오버라이딩해야한다. - actionPerformed(ActionEvent e)
	 * 3. 이벤트 소스와 이벤트처리를 담당하는 클래스를 매칭해야 반환
	 */
	public void initDisplay()
	{// 이벤트 소스  + addActionListener 
	//this는 addActionListener구현하고 있는 구현체 클래스를 가리킨다.->AddressBook이다
		btnSelect.addActionListener(this);
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);

		
		jp_north.add(btnSelect);
		jp_north.add(btnInsert);
		jp_north.add(btnUpdate);
		jp_north.add(btnDelete);
		jf.add("North", jp_north);
		jf.setTitle("주소록");
		jf.setSize(800,500);
		jf.setVisible(true);
		aDialog.initDisplay();
		aDialog.jdg_address.setVisible(false);
			
	}
	

	
	// 화면처리
	
	
	// 메인메소드
	
	
	public static void main(String[] args) {

		AddressBook abook = new AddressBook();
		abook.initDisplay();
		
		
	}

	//해당부분은 선언만 되어있고 구현이 안 되어있음 --> 추상클래스의 추상 메소드이다.
	
	/*
	 * actionPerformed메소드는 마치  main메소드처럼 버튼이 눌려지고 눌려졌다는 사실을 JVM이 감지하면
	 * 그때 자동으로 호출되는 메소드이다. -->Call Back Method
	 */
	@Override 
	public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
	System.out.println(command);
	
	//조회
	if("조회".equals(command))
	{
		System.out.println("조회버튼을 클릭하였습니다.");
		aDialog.set(command, false);
		
		
	}
	
	//입력
	else if("입력".equals(command))
	{
		System.out.println("입력 버튼을 클릭하였습니다.");
		aDialog.set(command, false);

		
	}
	//수정
	else if("수정".equals(command))
	{
		System.out.println("수정 버튼을 클릭하였습니다.");
		aDialog.set(command, false);

		}
	
	//삭제
	

	
	}

}

