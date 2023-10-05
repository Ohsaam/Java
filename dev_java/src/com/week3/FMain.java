package com.week3;

class F
{
	private int age;
	private String name;
	private String loc;
	
	
	public F(int age, String name, String loc)
	{
		this.age = age;
		this.name = name;
		this.loc = loc;
		FMain fm = new FMain(this);
	}
	
	}

public class FMain {

	
	
	
	public FMain(F f)
	{
		System.out.println(f);
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
