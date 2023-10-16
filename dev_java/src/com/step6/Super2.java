package com.step6;

public class Super2 extends Super1 {

	/*
	 * 다형성 :  같은 메소드를 호출 했는데 그 결과가 달라진다.
	 */
	int b =2;
	
	@Override
	void methodA()
	{
		super.methodA();
		System.out.println("Super2에서 실행됐음");
	}
	

	
	public static void main(String[] args) {
		Super1 su1 = new Super2(); // 업케스팅 
		Super2 su2 = (Super2)su1; // 다운캐스팅
	}
}
