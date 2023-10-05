package com.step3;

public class ifcase2 {

	public static void main(String[] args) {
	
		int i = 1;
		int j = 10;
		do {
			System.out.println("if문 이전 - 나는 실행기회를 못 갖는다.");
			if(i>j)
			{
				break;
			}
			System.out.println("if문 다음 - 나는 실행기회를 못 갖는다.");
			j--;
		}
		// j = 10        9			8			7
		// i = 2<5		3<5		4<5		5<5
		while( ++i < 5 );
		System.out.println("요기");

	}

}
