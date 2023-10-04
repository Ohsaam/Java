package com.Overriding;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame {
	
	public static JFrameTest1 jft = new JFrameTest1();
	
	public JFrameTest2()
	{
		System.out.println("디폴트 생성자");
		initDisplay();
	}
	public JFrameTest2(String name)
	{
		System.out.println("string name 실행");

	}
	
	public void initDisplay()
	{
		System.out.println("initDisplay 호출");
		this.setSize(500,400);
		this.setVisible(true);
		
		
	}
	
	public void methodA(JFrameTest1  jft)
	{
		System.out.println(jft);
		System.out.println("methodA() 호출");
	}
	
	public void methodB()
	{
		System.out.println("methodB() 호출");
	}

	public static void main(String[] args) {
		
		jft.methodA(jft); 
		System.out.println(jft); 
//		
		System.out.println("=====================");
		new JFrameTest1("jihwan").methodB(); 
		
		
		
		
	
		
	}

} 
