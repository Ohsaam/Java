package com.step4;

public class Oper2 {

	public static void main(String[] args) {
		int i = 2;
		//대입이 먼저야 - 1
		//증가가 먼저인가요? - 2
		//--i => i = i -1;
		int j = --i;//++증감연산자 1씩 증가해주세요- 변수 앞에 있으면 먼저 증가함
		//++증감연산자가 앞에 있으면 먼저 1증가시키고 대입한다
		System.out.println(i+", "+j);//1,1
	}

}
