package com.CollectionFrameWork;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		
		String s1 = null;
		String s2 = null;
		String s3 = null;
		ArrayList fruits = new ArrayList();
		/*
		 * Stack 구조다
		 */
		fruits.add("😊");
		s1=(String)fruits.get(0);
		fruits.add(1,"❤️");
		s2 =(String)fruits.get(1);
		fruits.add(1,"👍"); 
		s3 = (String)fruits.get(1);
		/*
		 * 끼워 넣기 부분 
		 */
		
		for(int i =0; i<fruits.size(); i++)
		{
			System.out.println(fruits.get(i)); 
			/*
			 * 하트가 밀려난다.
			 */
		}
		System.out.println(s1+","+s2+","+s3);
		
	}

}
