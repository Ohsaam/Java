package com.calculatorDiv;


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
	JButton jbtnClear = new JButton("C");
	//연산자(+) 누르기 전에 입력된 값 담기
	String v1 = "";//calcurate에서 필요함
	//연산자(=) 누르고 난 뒤에 입력된 값 담기
	String v2 = "";
	//연산자 담기(+,-,*,%)
	String op = "";	
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		//이벤트 처리를 담당하는 핸들러 클래스의 인스턴스변수를 준다.
		jbtnOne.addActionListener(this);
		jbtnTwo.addActionListener(this);
		jbtnPlus.addActionListener(this);
		jbtnEqual.addActionListener(this);
		jbtnBack.addActionListener(this);
		jbtnClear.addActionListener(this);
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
	/*********************************************************************************
	 * 사칙연산을 구현하기
	 * @param v1 -  연산자가 눌리기 전까지 입력된 숫자묶음
	 * @param v2 - =눌렸을 때 그 전까지 입력된 숫자묶음
	 * @param op -  +, -, *, /
	 * @return - JTextField에 계산된 결과를 출력해야 한다. String이다. jtf_display.setText("3");
	 *********************************************************************************/
	public String calcurate(String v1, String v2, String op) {
		double d1 = Double.parseDouble(v1);
		double d2 = Double.parseDouble(v2);
		if("+".equals(op)) {
			return String.valueOf(d1+d2);
		}
		else if("-".equals(op)) {
			return String.valueOf(d1-d2);			
		}
		else if("*".equals(op)) {
			return String.valueOf(d1*d2);						
		}
		else if("/".equals(op)) {
			return String.valueOf(d1/d2);									
		}
		else {
			return "error";
		}
	}///////// end of calcurate //////////
	public static void main(String[] args) {
		CalcView cv = new CalcView();
		cv.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			//전처리하기 - 맨앞에 0이 있는 경우 전처리함
			if("0".equals(jtf_display.getText())) {
				jtf_display.setText("");
			}
			jtf_display.setText(jtf_display.getText()+"1");
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			//전처리하기 - 맨앞에 0이 있는 경우 전처리함
			if("0".equals(jtf_display.getText())) {
				jtf_display.setText("");
			}
			jtf_display.setText(jtf_display.getText()+"2");			
		}
		else if("+".equals(command)) {//너 + 버튼 누른거야?
			System.out.println("더하기 버튼");
			//insert here - v1담기
			v1 = jtf_display.getText();
			System.out.println("v1 : "+ v1);
			op = "+";
			jtf_display.setText("");
		}
		else if("=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("계산 결과는 얼마");			
			//insert here - v2담기
			v2 = jtf_display.getText();
			String result = calcurate(v1,v2,op);
			jtf_display.setText(result);
		}		
		else if("<=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("한글자씩 지우기 구현");		
		}		
		else if("C".equals(command)) {//너Clear 버튼 누른거야?
			jtf_display.setText("");	
		}		
	}//////////////////////// end of actionPerformed /////////////////////////////

}
