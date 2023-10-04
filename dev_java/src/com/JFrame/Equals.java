package com.JFrame;

public class Equals {

	public static void main(String[] args) {
		String s1 = "안녕하세요";
		String s2 = "잘가세요";
		String s3 = new String("안녕하세요");
		String s4 = new String("잘가세요");

		
		// 글자를 비교 [equals "값" ]자체를 비교 
		System.out.println(s1 == s2); // 같은 방향을 가르킨다.
		System.out.println(s1 == s3); // s3은 새로운 객체를 생성 
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4)); 

		

		
		

	}

}
