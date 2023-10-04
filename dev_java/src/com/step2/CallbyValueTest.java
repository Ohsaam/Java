package com.step2; // 이 부분 복기


class Param{
	int ival; // 전역변수 + 디폴트값은 0이다.  + 100
	
}


public class CallbyValueTest {
	
	void effectParam(Param p)
	{
		p = new Param();
		p.ival = 500;
		System.out.println("sub ival == " + p.ival);

	}


	public static void main(String[] args) {
		
		
		Param p = new Param();
		p.ival = 100;
		CallbyValueTest b = new CallbyValueTest();
		b.effectParam(p);
		System.out.println("main ival == " + p.ival);

	}
	// 메소드의 파라미터 자리에는 선언만 가능하다. 

}
