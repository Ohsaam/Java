package com.step1;

public class Static {
	int x;
	int y;
	
	public static void methodsA()
	{
		int x = 5;
		System.out.println(x);
		Static c = new Static(); // 0으로 바꿈 --> 전역변수로 바로 가고 싶다면 인스턴스화 하고 접근하면된다.
		System.out.println(c.x);
		
	}
	
	public void methodB()
	{
		int x = 5; //나는 지역변수다.
		System.out.println(this.x); // 변수(지역변수와 전역변수의 이름이 같을 때) this를 붙여서 구분한다. 
	}
	
	

	public static void main(String[] args) {
		Static.methodsA(); // STATIC은 클래스이름.메소드이름으로 적는다.
		Static a = new Static();
		a.methodB();
		



	}


}
