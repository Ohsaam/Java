package com.step6;

public class Me2 extends Super2{
	@Override
	public void methodC()
	{
		
	}
	
	public static void main(String[] args) {
		Me2 me = new Me2();
		Super2 sup1 = new Me2();
		Super2 sup11 = new Super2();
		System.out.println(me.a);
		/*
		 * Me2 타입은 Super2만 상속 받았지만 그 전에 Super1을 상속받고 있으므로 Super1에서 정의된 메소드 호출 방법
		 */
		me.methodA();
		sup1.methodA();
		me.methodC();
	}

}
