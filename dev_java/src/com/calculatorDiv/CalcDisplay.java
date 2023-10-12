package com.calculatorDiv;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcDisplay {

	/*
	 * UI가 -> 사용자가 Select 했을 때 이벤트 처리 -> CalcLogic
	 */
	CalcLogic calclogic = new CalcLogic(this);
	CalcEvent calcevent = new CalcEvent(this);
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnClear = new JButton("C");
	
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		//이벤트 처리를 담당하는 핸들러 클래스의 인스턴스변수를 준다.
		jbtnOne.addActionListener(calcevent);
		jbtnTwo.addActionListener(calcevent);
		jbtnPlus.addActionListener(calcevent);
		jbtnEqual.addActionListener(calcevent);
		jbtnBack.addActionListener(calcevent);
		jbtnClear.addActionListener(calcevent);
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jp.add(jbtnClear);
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		CalcView cv = new CalcView();
		cv.initDisplay();
	}
}
