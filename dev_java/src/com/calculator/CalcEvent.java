package com.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcEvent implements ActionListener{

	// 연산자 누르기 전에 입력된 값 담기 
	String v1 = "";
	
	// 연산자 누르고 난 뒤에 입력된 값 담기
	String v2 = "";
	
	// 연산자(=)를 담는다.(%,-,+,*)
	String op = "";
	
	CalcUI calcUI = null;
	
	public CalcEvent(CalcUI calcUI) {
		this.calcUI = calcUI;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			if("0".equals(calcUI.jtf_display.getText()))
			{
				calcUI.jtf_display.setText("");
			}
			calcUI.jtf_display.setText(calcUI.jtf_display.getText()+"1");
			
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			calcUI.jtf_display.setText(calcUI.jtf_display.getText()+"2");			
			if("0".equals(calcUI.jtf_display.getText()))
			{
				calcUI.jtf_display.setText("");
			}
		}
		else if("+".equals(command)) {//너 + 버튼 누른거야?
			System.out.println("더하기 버튼");
			v1 = calcUI.jtf_display.getText();
			op = "+";
			calcUI.jtf_display.setText("");
		}
		else if("=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("계산 결과는 얼마");			
			v2 = calcUI.jtf_display.getText();
			double d1 = Double.parseDouble(v1);
			double d2 = Double.parseDouble(v2);
			String rs = String.valueOf(d1+d2);
			calcUI.jtf_display.setText(rs);
			
		}		
		else if("<=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("한글자씩 지우기 구현");		
		}		
		
		else if("C".equals(command))
		{
			calcUI.jtf_display.setText("");
		}
		
	}
}
