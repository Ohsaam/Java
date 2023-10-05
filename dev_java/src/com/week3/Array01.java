package com.week3;

public class Array01 {

	public static void main(String[] args) {

		int[] temp = new int[5];
		temp[0] = 1;
		temp[1] = 10;
		temp[2] = 20;
		
		int[] my = {1,2,3};
		int[] other = new int[] {1,2,3};
		int[] other1 = new int[] {1,2,3,4,5,6};
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
		
		for(int i : my)
		{
			System.out.println(i);
		
		}
		
		for(int j : other1)
		{
			System.out.println(j + '\n');
		}
		
		int[] arr = {1,2,3};
		
		
	}

}
