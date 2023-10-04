package com.ABCDEFG;

public class Z {

	int i = 1;
	void m1()
	{
		Z z = new Z();
		Z c = new Z();
		System.out.println(z.i);
		System.out.println(z);
		c = m2(z);
		System.out.println(c);
		
		
	}
	// 여기에서 6번에 생성된 주소번지를 굳이 사용하고 싶다 어떡하지?
	Z m2(Z z)
	{
		System.out.println(z);
		
		return z;
	}
	public static void main(String[] args) {
		
		Z i = new Z();
		i.m1();
		i.m2(i);
		/*
		 * println(i.m1())이 안되는 이유는 return / 반환하는 부분이 없다는 것이다.
		 */
	}

}
