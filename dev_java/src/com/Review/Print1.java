package com.Review;

public class Print1 {
	static String name;
	
	
	static int m() 
	{
		return 5;
		
	} // 클래스 필드가 아니라 클래스 메서드이다.
	
	int  j() 
	{
		int k = Print1.m();
		System.out.println(k);
		return k;

	}

	public static void main(String[] args) {
		int i  =9;
		Print1 a = new Print1();
		System.out.println(1);
		System.out.println("안녕");
		System.out.println(1.5);
		System.out.println(true);
		System.out.println(Print1.m()); // 이 부분 복습 // 메소드 호출 시 메소드 ( 파라미터 자리에 --> 메소드 호출 가능함))
		System.out.println("==================");
		System.out.println(a.j()); // 이 부분은 안 된다. return 타입이 void라서
		
		
		/* 메소드의 파라미터 자리에서 또 다른 메소드를 호출 할 수 있다.
		 * 단 리턴 타입이 void인 건 아니다.
		 */
		
		 // 리턴 타입이 없기 때문에 -> 대입 연산자에서 사용 불가하다.
	}

}
