package com.Scan;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		System.out.println("메뉴를 선택하세요[새게임:1, 정답확인:2, 종료:3]");
		Scanner sc = new Scanner(System.in);
		//사용자가 선택한 메뉴 번호를 담을 변수 선언.
		int menu = 0;
		
		for(int i =0; i <3; i++)
		{
			menu = sc.nextInt();
			
			// 새로운 게임을 원해? --- 1
			if(menu == 1)
			{
				System.out.println("새 게임을 선택했습니다.");
			}
			
			else if(menu == 2)
			{
				System.out.println("정답 보기를 선택하였습니다.");
				
			}
			// 정답을 확인하고 싶어? ---2
			
			
			// 그만하고 싶어? ---3
			else if(menu == 3)
			{
				System.out.println("종료를 선택하였습니다.");
			}
		}
		
	}

}


/*
	사용자와 개발자 사이의 소통하기
	이것은 화면 구현을 통해서 가능하다.
	화면에서 입력 받아야 하는 값들이 파라미터 자리를 채워야한다.
	
*/