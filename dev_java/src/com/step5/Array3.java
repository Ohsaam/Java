package com.step5;

public class Array3 {

	public static void main(String[] args) {
		int[] a = new int[3];
		
		for(int i = 0; i<= a.length; i++)
		{
			System.out.println(a[i
			                     ]);// java.lang.ArrayIndexOutOfBoundsException: 왜? for문 <= 때문에
		}
	}
}
