package com.step5;

class Super
{
	
	int i;
	Super()
	{
		System.out.println("Super() 호출");
	}
	
	void methodB()
	{
		System.out.println("methodB");
	}
	
	void methodA()
	{
		System.out.println("methodA");
	}
	void methodA(int i)
	{
		System.out.println("methodA(int i) : "+ i);
	}
	
}///////////////////////end of Super


class Sub extends Super{
	Sub()
	{
		System.out.println("Sub() 호출");
		i = 2;
		methodA(i);
		methodB();
	}
	
	@Override
	void methodA(int i)
	{
		super.methodA(30);
		System.out.println("Sub methodA(int i) : "+i);
	}
	
}///////////////////////end of Sub


public class Extends1 {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		/*
		 * 이렇게 인스턴스화만 해도 부모 클래스의 Super() 생성자를 호출한다.
		 */
		
		sub.methodB();
		System.out.println("main Extends1 : "+sub.i);
		

	}

}
