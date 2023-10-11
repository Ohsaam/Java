package com.calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcUI {

	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnC = new JButton("C");
	
	CalcEvent ce = new CalcEvent(this);

	
	
	public void initDisplay() {
		//이벤트 처리를 담당하는 핸들러 클래스의 인스턴스변수를 준다.
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		
		jbtnOne.addActionListener(ce);
		jbtnTwo.addActionListener(ce);
		jbtnPlus.addActionListener(ce);
		jbtnEqual.addActionListener(ce);
		jbtnBack.addActionListener(ce);
		jbtnC.addActionListener(ce);
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
		CalcUI cu = new CalcUI();
		cu.initDisplay();
	}
}
