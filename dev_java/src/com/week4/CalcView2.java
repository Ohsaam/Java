package com.week4;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CalcView2 implements ActionListener{

	// 선언부
	/*
	 * 현재 메모리에 로딩되어 있는 클래스 자신을 의미한다.
	 */
	CalcLogic cLogic = new CalcLogic(this); // 생성자의 파라미터자리를 통해서 넘긴다.
	CalcEvent cEvent = new CalcEvent(this);
	JFrame jf = new JFrame();
	
	// 생성자
	CalcView2(){}
	
	
	//화면처리부
	public void initDisPlay()
	{
		jf.setSize(400,400);
		jf.setVisible(true);
		
	}
	
	//메인메소드
	public static void main(String[] args) {
		CalcView2 cv = new CalcView2();
		cv.initDisPlay();
		
		
	}
	
