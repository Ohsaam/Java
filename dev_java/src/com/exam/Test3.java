package com.exam; 
//**********************
//이건 몰랐던 개념 참고하셈 --> public class tset2를 출력할 때, 다른 클래스를 선언할 때는 class p 만 선언 가능하다.
//만약에 여기서 사용하고 싶으면  클래스이름.static변수로 선언해야된다. (P.i) 로 선언된다.
// 다시 말하자면 
//**********************

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//P a = new P();
		
		//System.out.println(a.j); // 사용이 안 된다. -> static이 아니기 때문 
		//System.out.println(P.i);
		//**********************
		// 다른 클래스에 Static이 있는 변수를 '참조' 하는 것이라면, 클래스이름.static 변수로 선언이 가능하다.
		// 일반 전역변수를 여기로 끌어와서 사용하려면, 인스턴스화를 진행하고 -> 레퍼런스 타입.변수로 선언해야된다.
		//**********************
		System.out.println(T.x);
		T.x++;
		System.out.println(T.x)
		
		;
		
	
	
	
	}

}
 	