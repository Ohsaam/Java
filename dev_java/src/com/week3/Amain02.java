package com.week3;


class A01
{
	private String name;
	private int age;
	private String loc;
	
	public A01(Amain02 a)
	{
		System.out.println("A01공간 "+ a);
		C c = new C(this);
	}
	
	public A01()
	{
		
	}
	
	}

class C
{
	int i = 10;
	public C() {}
	
	public C(A01 a)
	{
		System.out.println("C공간"+a);
	}
	

}




public class Amain02 {
	
	public Amain02()
	{
		A01 a = new A01(this);
		System.out.println("Amain02공간"+a);
		
	}

	public static void main(String[] args) {

		Amain02 am = new Amain02();
		System.out.println(am);
		System.out.println("=============================================");
		
		A01 a = new A01(am);
		System.out.println(a);
		System.out.println("=============================================");

		C c = new C(a);
		System.out.println(c);
		System.out.println("=============================================");

		
		
	}

}
