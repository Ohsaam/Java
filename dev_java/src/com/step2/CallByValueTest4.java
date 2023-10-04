package com.step2; // ★★★

public class CallByValueTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("키위");
		System.out.println(s1);
		//같은 이름의 변수(s1) 이더라도  
		s1 = new String("전달");
		System.out.println(s1);

	}

}
/* String 타입은 클래스이지만 마치 원시형타입처럼 값이 출력된다. 주소 번지를 볼 수 없다. */