package com.Overriding;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {

		Random r = new Random();
		
		
		for(int i = 0; i<10; i++)
		{
			int x = r.nextInt(10);
			System.out.println(x);  
		}
	}

}
