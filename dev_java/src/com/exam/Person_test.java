package com.exam;

public class Person_test { // 부모클래스 
	
	public static void main(String[] args)
	{
		Jihwan a = new Jihwan(); // 부모클래스가 자식 클래스를 참조하는 경우 
		
		a.run();
		
	}
	
	
	public void run()
	{
		System.out.println("사람은 달린다.");
	}
	

}
