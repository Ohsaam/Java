package com.step1;

class A1{
	int i = 1;
	
	
}


public class ASimulation2 {

	public static void main(String[] args) {
		
		A1 a = new A1();
		int j = a.i; // 치환 
		// 내 안에서 A클래스에 정의된 전역변수를 호출하기
		System.out.println(a.i);
		System.out.println(j);

		
		

	}

} 
/* 
Asimulation.java
A.class + Asimulation.class 
*/
