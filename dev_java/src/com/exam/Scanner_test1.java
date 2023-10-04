package com.exam;

import java.util.Scanner;

public class Scanner_test1 {

	public static void main(String[] args) {
		String[] name = new String[25];
		int[] score = new int[25];
		int size = name.length;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<size; i++)
		{
			name[i] = sc.next();
			
			
			score[i] = sc.nextInt();
			
			System.out.println("값을 출력하세요" + name[i] + score[i]);
			
		}
		
		
	}
	

}
