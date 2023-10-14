package com.CollectionFrameWork;

import java.util.ArrayList;

public class TestList2 {
	/*
	 * 1. 메소드를 통해서 파라미터를 통해서 값을 받는 부분을 구현한다.
	 */
	public void Example(ArrayList<String> jihwan)
	{
		for(int i = 0; i <jihwan.size(); i++)
		{
			System.out.println(jihwan.get(i));
		}
	}
	
	//+그러면 나는 ArrayList를 또 쪼개고 싶어
	public ArrayList<String> Example1()
	{
		ArrayList<String> jihwan = new ArrayList<>();
		jihwan.add("hansome");
		jihwan.add("good smell");
		jihwan.add("sick");
		return jihwan;
	}
	public static void main(String[] args) {
		ArrayList<String> t1 = new ArrayList<String>();
		TestList2 tl2 = new TestList2();
		t1 = tl2.Example1();
		tl2.Example(t1);
		
		
		
	}

}
