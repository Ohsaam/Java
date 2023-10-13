package com.step5;

public class Array21 {
	public static void main(String[] args) {
		int[][] is = new int[2][3];
		is[0] = new int[3];
		is[1] = new int[3];
		
		System.out.println(is[0].length);
		System.out.println(is[1].length); // 3이다 
		
		for(int i =0; i<is.length; i++)
		{
			for(int j = 0; j<is[0].length; j++)
			{
				/*
				 * 1. 값을 
				 */
				System.out.println("is[" + i + "][" + j + "]=" + is[i][j]);
			}
		}
	}

}
