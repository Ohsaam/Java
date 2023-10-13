package com.CollectionFrameWork;

import java.util.ArrayList;

public class List3 {
	void getFruitList(ArrayList<String> fruits)
	{
		for(int i =0; i<fruits.size(); i++)
		{
			System.out.println(fruits.get(i));
		}
	}
	
	ArrayList<String> methodA()
	{
		ArrayList<String> fruits = new ArrayList<>(); // 배열로 웃는얼굴-하트- 딸기 (밀려나서)
		fruits.add("🎶🎶");
		fruits.add(0,"👍"); 
		fruits.add(1,"❤️");
		return fruits;
	}
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); // 배열로 웃는얼굴-하트- 딸기 (밀려나서)
		List3 l3= new List3();
		fruits=l3.methodA();
		System.out.println(fruits); // 이렇게 호출하면 리스트형태로 반환된다. [, , , ,]
	}

}
