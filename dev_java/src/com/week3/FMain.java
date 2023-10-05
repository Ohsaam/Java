package com.week3;

class F
{
	int b;
	FMain fm = new FMain(this);
	
	}

public class FMain {
	private int age;
	private String name;
	private String loc;
	
	
	
	public FMain(F f)
	{
		f.b = 20;
		System.out.println(f);
		System.out.println(f.b);
	}
	
	public FMain()
	{
		System.out.println("디폴트 생성자.");
	}
	public static void main(String[] args) {
		
		F f = new F();
		FMain fm = new FMain(f);
		FMain fm1 = new FMain();
		System.out.println(fm1);
		

	}

}
