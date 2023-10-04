package com.exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) { 
		// 점수를 입력받아 값을 처리하는 프로그램을 구현할 것.
		// 생성자를 이용하여 구현할 것.
		// 배열 인스턴스를 참고하여 평균을 구하는 프로그램을 만들 것.
		Exam a = new Exam();
		a.UserInput(); // 사용자로부터 값을 읽어들인다.
		

		


		
	}
	
	public void UserInput()
	{
		int[] Math = new int[3];
		int[] Korean = new int[3];
		String[] name = new String[3];
		
		int size = name.length;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < size; i++)
		{
			System.out.print("수학점수를 입력하세요:"); // 75
			Math[i] = input.nextInt();
			System.out.print("국어점수를 입력하세요:"); // 90
			Korean[i] = input.nextInt();
			System.out.print("이름을 입력하세요:"); //지환
			name[i] = input.next();
		}
		
		

	}
	

}
