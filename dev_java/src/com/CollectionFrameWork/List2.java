package com.CollectionFrameWork;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		ArrayList fruits = new ArrayList(); // 배열로 웃는얼굴-하트- 딸기 (밀려나서)
		fruits.add("😊");
		fruits.add(1,"👍"); 
		fruits.add(1,"❤️");
		String r1= (String)fruits.remove(1);
		
		System.out.println(fruits);
		System.out.println(r1);
	}

}
