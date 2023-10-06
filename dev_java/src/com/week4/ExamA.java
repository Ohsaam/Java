package com.week4;

public class ExamA {

	int i= 10;
	/*
	 * 여기서 만약에 ExamA의 객체를 참조하여 ExamB에 쓰고 싶다면, 생성자로 인스턴스화가 가능하다.
	 * 
	 */
	ExamB eb = new ExamB(this);
	
	public ExamA(){
	}
	
	public static void main(String[] args) {
		ExamA  a	= new ExamA();
		System.out.println(a);
			

		
		
	}

}
