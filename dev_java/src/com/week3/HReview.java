package com.week3;

import java.util.Scanner;

class HR{
	
	int b;
	HReview hr = new HReview(this);
	/*
	 * 처음 오류가 난 이유는 HReview에 대한 생성자가 없기 때문이다.
	 */
	
}

public class HReview {
	
	int hr;
	Scanner sc = new Scanner(System.in);
	
	public HReview(HR h)
	{
		int user = sc.nextInt();
		this.hr = user;
		System.out.println(hr);
		methodA();
	}
	
	void methodA()
	{
		System.out.println(hr);
	}

	public static void main(String[] args) {
		
		HR h1 = new HR();
		System.out.println(h1);
		HReview hr = new HReview(h1);
		System.out.println(h1); // 전변이라 값이 바뀜

	}

}
