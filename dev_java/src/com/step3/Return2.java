package com.step3;

public class Return2 {
	void m(int i) {//11번에서 호출될 때 파라미터 자리에 -1있다.
		if(i==-1) {//-1==-1같니? 네 true
			return;//if문안에 return을 쓰면 메소드를 탈출하고 나를 호출한 메인메소드이동
		}
		System.out.println("요기");
	}
	public static void main(String[] args) {
		Return2 r2 = new Return2();
		r2.m(-1);
		System.out.println("여기");
	}

}
