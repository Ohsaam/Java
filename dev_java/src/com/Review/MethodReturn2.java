package com.Review;
//  학습목표 : println도 다른 클래스의 메소드인데 파라미터 값으로  메소드를 받을 수 있다는 점이 내가 몰랐던  부분이다.


public class MethodReturn2 {
	int i = 10;
	
	
	
	int MethodA()
	{
		int i = 1000;
		return i;
	}
	
	
	int MethodB()
	{
		double i = 24.7;
		
		return (int)i;

	}

	public static void main(String[] args) {
		
		MethodReturn2 w = new MethodReturn2();

		int k = w.MethodB();  // Case# 1 : 값을 대입받아서 사용하는 경우
		System.out.println(k); //값을 담아서 출력
		
		k = 27;
		
		
		System.out.println(w.MethodB());
		System.out.println("==============MethodB===================");
		System.out.println(w.MethodA()); //해당 부분이 그 부분이다. 파라미터로 사용이 가능하다는걸 볼 수 있다.
		System.out.println("==============MethodA===================");

		
		
		

	}

}
