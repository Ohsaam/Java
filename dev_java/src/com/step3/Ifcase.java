package com.step3;

public class Ifcase {

	public static void main(String[] args) {

		int i  = 1;
		int k = i++; 
		System.out.println(i);
		System.out.println(k);
		
		/*
		 * 1. OR || 비교 일 때는 ex: 아이디 중복조건
		 * 		- 첫번째 조건이 참이면 두번쨰 조건은 따질 필요가 없다. 어차피 실행된다.
		 * 
		 * 2. And && 비교일 때는
		 *  	- 첫번째 and 두번째 조건을 따져야한다.
		 * 
		 */
		
		if((++i >= k) && (i<k--))
		{
			System.out.println("참");
		}
		else
		{
			System.out.println("거짓");
		}
		
		System.out.println(i + ", " + k);
		
		i+=k;
		
		System.out.println(i + ", " + k);
	}

}
