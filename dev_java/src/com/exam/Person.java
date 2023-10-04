package com.exam;

public class Person {

	String name;
	double height;
	
	public void PersonName(String name)
	{
		System.out.println("내 이름은 : " + name);
	
	}
	
	
	public static void Personage(int i)
	{
		System.out.println("내 이름은 : " + i);
	
	}
	
	public Person(String name,double height)
	{
		this.name = "오지환";
		this.height = 185;
	}
	
}
