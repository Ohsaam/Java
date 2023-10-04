package com.basic1;


class Exam{
	private int i = 4;
	private String b = "지환";

	public int getIntExam()
	{

		return i;

	}

	public String getStringExam()
	{

		return b;
	}

	public void SetStringExam(String b)
	{
		this.b = b;
	}
	public void SetExam(int i)
	{
		this.i = i;

	}
}

public class Test {
	

	public static void main(String[] args) {

		Exam a = new Exam();
		System.out.println("==================");

		a.SetStringExam("감사합니다.");
		a.SetExam(95);
		System.out.println(a.getStringExam());
		System.out.println(a.getIntExam());






		
		
		
	}

}
