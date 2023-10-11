package com.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView implements ActionListener{
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnC = new JButton("C");
	// 연산자 누르기 전에 입력된 값 담기 
	String v1 = "";
	
	// 연산자 누르고 난 뒤에 입력된 값 담기
	String v2 = "";
	
	// 연산자(=)를 담는다.(%,-,+,*)
	String op = "";
	
	
	public void initDisplay() {
		//이벤트 처리를 담당하는 핸들러 클래스의 인스턴스변수를 준다.
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		
		jbtnOne.addActionListener(this);
		jbtnTwo.addActionListener(this);
		jbtnPlus.addActionListener(this);
		jbtnEqual.addActionListener(this);
		jbtnBack.addActionListener(this);
		jbtnC.addActionListener(this);
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jp.add(jbtnC);
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	

	public static void main(String[] args) {
		CalcView cv = new CalcView();
		cv.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			if("0".equals(jtf_display.getText()))
			{
				jtf_display.setText("");
			}
			jtf_display.setText(jtf_display.getText()+"1");
			
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			jtf_display.setText(jtf_display.getText()+"2");			
			if("0".equals(jtf_display.getText()))
			{
				jtf_display.setText("");
			}
		}
		else if("+".equals(command)) {//너 + 버튼 누른거야?
			System.out.println("더하기 버튼");
			v1 = jtf_display.getText();
			op = "+";
			jtf_display.setText("");
		}
		else if("=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("계산 결과는 얼마");	x		
			v2 = jtf_display.getText();
			double d1 = Double.parseDouble(v1);
			double d2 = Double.parseDouble(v2);
			String rs = String.valueOf(d1+d2);
			jtf_display.setText(rs);
			
		}		
		else if("<=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("한글자씩 지우기 구현");		
		}		
		
		else if("C".equals(command))
		{
			jtf_display.setText("");
		}
		
	}

}