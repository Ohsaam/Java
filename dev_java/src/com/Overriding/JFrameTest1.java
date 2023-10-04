package com.Overriding;

import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	
	
	public JFrameTest1()
	{
		System.out.println("디폴트 생성자");
		initDisplay();
	}
	public JFrameTest1(String name)
	{
		System.out.println("string name 실행");
		methodB();
		

	}
	
	//사용자메소드 정의하기
	public void initDisplay()
	{
		System.out.println("initDisplay 호출");
		this.setSize(500,400);
		this.setVisible(true);
// 내 안에 선언된 메소드가 아니다.
// 내(JFrame Test1) 안에 선언된 메소드(setSize(int,int)가 아니다. 그럼 어디에?JFrame
// this는 자바가 제공하는 수정자이고 보통 자기자신을 가르킬 때 사용한다. 
// 주로 전변과 지변에 이름이 같은 경우 구분 하기 위해 사용한다.
		
		
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
		
//// main 내부에서 인스턴스화를 하면 지변의 성격이 된다.
		JFrameTest1 jft = new JFrameTest1();
		jft.methodA(jft); //메소드 파라미터 자리가 원시형 타입인 경우 + 메소드 파라미터 자리가 참조형 타입인 경우 + 갯수
		System.out.println(jft); // 지변이지만 메소드 호출 시 파라미터를 통해서  원본을 넘길 수 있다.
		
		System.out.println("=====================");
		new JFrameTest1("jihwan").methodB(); 
//		// 화면이 두개열린다. -> initDisplay 메소드가 2번 호출되니깐
		
		
		
		
	
		
	}

} 
// 생성자 안에서 인스턴스 없이도 사용 할 수 있다.
