package com.baseballgame;

/*
 * 학습 목표 : 다트 연산자 2개 입력 
 */
class C
{
	int i;
	C getInstance()
	{
		
		return new C();
	}
	}

public class CMain {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.i); // 0
		
		c.i = 10;
		System.out.println(c.getInstance().i); // 0 - > 복사본이다. c.i = 10이 안 들어간다. 0
		//이유는 getInstance 했을 때 인스턴스화가 되서 새로운 객체생성
	}

}
