package com.week3;

class Test
{
	int i = 40;
	
	public Test(Test01 t)
	{
		System.out.println(t);
		System.out.println(t.i);
	}
	
	}
public class Test01 {
	
	int i =20;
	
	public Test01()
	{
		Test tt = new Test(this);
	}
	
	public static void main(String[] args) {
		Test01 ts = new Test01();
		System.out.println(ts);
		
		ts = new Test01(); // i = 20
		ts.i = 2000;
		System.out.println(ts.i);
		

		
	}

}
