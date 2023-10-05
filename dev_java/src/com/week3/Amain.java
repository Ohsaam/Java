package com.week3;


class A
{
	public A(Amain c)
	{
		System.out.println(c);
	}
	
	}

public class Amain {
	
	
	public Amain()
	{
		A a = new A(this);
	}
	
	public static void main(String[] args) {
		
		Amain am = new Amain(); 
		System.out.println(am);
		/*
		 * 1. Amain - 기본 생성자가 호출된다. -> 갔더니 A a = new A(this) -> this는 Amain 타입의 변수로 넘김.
		 * 2. 그 값을 이어받아 A 클래스의 기본생성자가 호출된다.
		 * 3. 다르게 말하면 Amain의 인스턴스 값을  A에서 사용할 수 있다. [생성자를 통해서]
		 */
		
	}

}
