package com.Overriding; // 학습 목표 : 메소드를 활용해서 나는 인스턴스화를 할 수 있다.

import java.util.Scanner;

public class AddressBook {
	AddressBook abook = null;
	
	
	// 2. 메소드를 활용해 인스턴스
	public AddressBook getObject()
	{
		if(abook == null) // 객체를 생성하기전에 null 체크를 먼저(선처리)를 해서 
		{
			abook = new AddressBook();
		}
//		else
//		{
//			Scanner sc = new Scanner(System.in);
//			String name  = sc.next();
//			
//			
//		}
		
		return abook;
	}
	
	// 3. 메소드 안에서 조건에 따라 인스턴스화를 다르게 가져갈 수도 있다. 0 다른 선택지가 생김
	

	
	public static void main(String[] args) {

		// 인스턴스 방법에는 여러가지가 있다.
		//1,기본 방법
		AddressBook abook = new AddressBook();
		
		
	}

}
