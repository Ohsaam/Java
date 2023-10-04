package com.JFrame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressDialog{

	//선언부
	 	JFrame jf = new JFrame();
	    JDialog jdg_address = new JDialog();
	    JPanel jp_north = new JPanel();
	    JButton btnSelect = new JButton("조회");
	    JButton btnInsert = new JButton("입력");
	    JButton btnUpdate = new JButton("수정");
	    JButton btnDelete = new JButton("삭제");
	    Dimension dim = new Dimension(400, 500); // dim 변수 초기화

	
	public AddressDialog()
	{
		//initDisplay();
		
	}

	

	//화면처리부
	public void initDisplay()
	{
		jdg_address.setTitle("조회|입력|수정"); // 메소드 설계, 파라미터 결정한다.
		jdg_address.setSize(400,500);
		//jdg_address.setVisible(false);


	}
	
	/*
	 * 메소드 설계를 통해서 반복되는 코드와 제어권은 AddressBook애 가지면서도 
	 * 그 변호된 부분은 AddressDialog에서 처리하는 방법을 알아보자.
	 */
	
	
	/*
	 * 버튼이 눌리는건 AddressBook클래스에서 알고 있다. -> actionPerformed가 있음
	 * 그 버튼이 눌렸을 때 AddressDialog 클래스의 title 값을 변경해야한다.
	 */
	
	/*
	 * AddressBook에서 눌린 버튼의 라벨값을 set메소드의 파라미터를 통해서 받아오고 setTitle메소드를 호출하여
	 * 이 문제를 해결 할 수 있다.
	 */
	
	public void frame()
	{
	      //  jf.setLocation(200, 400);
	        // jf.setPreferredSize(dim); // 주석 처리
	        JPanel select = new JPanel();
	        jdg_address.setTitle("조회");
	        select.setLayout(new BoxLayout(select, BoxLayout.X_AXIS));
	        select.add(new JLabel("나이 :"));
	        select.add(new JTextField());
	        jdg_address.setSize(400, 500); // JDialog의 크기 설정
	        jdg_address.setVisible(true);
		
		
		
		
	
	}
	
	public void set(String title, boolean isView)
	{
		jdg_address.setTitle("조회|입력|수정");
		jdg_address.setVisible(true);
		
		if("조회".equals(title))
		{
			frame();
			
		}
		else if ("입력".equals(title))
		{
			jdg_address.setTitle("입력");
			jdg_address.setVisible(true);
			jdg_address.setSize(500,600);
		}
		else if ("수정".equals(title))
		{
			jdg_address.setTitle("수정");
			jdg_address.setVisible(true);
			jdg_address.setSize(500,600);
		}
		
		
		
	}
	

//	public UserInput input(UserInput[] input)
//	{
//		
//
//		return input;
//		
//	}
////	
////
//	public void input()
//	{
//		jdg_address.setTitle("입력");
//		jdg_address.setSize(400,500);
//		
//	}
//	
//	
//	public void update()
//	{		
//		jdg_address.setTitle("조회");
//		jdg_address.setSize(400,500);
//	}




	
//	public static void main(String[] args)
//	{
//		
//		AddressDialog ad = new AddressDialog();
//		
//	
//	}
	
	}
