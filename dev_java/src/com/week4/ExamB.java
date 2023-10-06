package com.week4;

public class ExamB {
	
	ExamA a = null;
	
	/*
	 * 타입이 ExamA라는 n를 = null 로 초기화 해서 
	 * ExamA a를 파라미터로 받을 떄 매핑 해준다 --> this로 만약에 null로 안하면 NullPointException이다.
	 */
	public ExamB(ExamA a)
	{
		this.a = a;
		
		System.out.println(a);
		System.out.println(this.a.i);
		System.out.println(++this.a.i);

	}

}
