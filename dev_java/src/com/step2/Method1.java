package com.step2;

import java.util.Scanner;

public class Method1 {
	
	public String login(String id, String pw) {
		return id+pw;
	}
	//메소드 리턴타입에 void가 아닌 원시형 또는 참조형이 오면 반드시 마지막에 return 예약어를 작성한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method1 a = new Method1();
		System.out.println(Method1.methodF());
		System.out.println(a.methodA(3, 4));
		// 선언된 메소드의 파라미터가 두개인데 파라미터 값을 3개 적는 건 불법이다. 
		String name = a.login("지환이", "아잉교");
		// main 안에서 선언된 지역변수 name의 값을 굳이 methodD에서 쓰고 싶어요 어떡하지?
		System.out.println(a.methodD(name));
		a.Input_A();
		
		
	}

	public int methodA(int i, int j)
	{
		return i+j;
	}
	
	public double methodB()
	{
		return 3.14;
	}
	
	public boolean methodC()
	{
		return false;
	}
	public String methodD(String name)
	{
	
		return name;

	}
	public static int methodF()
	{
		return 12;
	}
	
	public void Input_A() {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[20];
		int[] age = new int[20];
		
		int size = name.length;
		
		for(int i = 0; i<size; i++)
		{
			name[i] = sc.next();
			age[i] = sc.nextInt();
			System.out.println("사용자의 이름은 >>>>>" + name[i] + "입니다.");
			System.out.println("사용자의 나이는 >>>>>" + age[i] + "입니다.");		
		}
		
		}
	
}

/*
 * 1. 메소드 선언하기  
 * -리턴타입을 결정해주세요
 * -파라미터가 필요한가요?
 * -나만 사용할 건지[private], 공유[public]할건지 결정하면  으로 공유한다. 
 * - public>protected>friendly>private 
 * protected -> 서로 다른 패키지라고 하더라도 서로 상속관계에 있으면 접근 할 수 있다.
 * friendly -> 접근 할 수 없다. 
 * 
 * (접근제한자) 리턴타입(void, 원시형 타입, 참조형 타입) 이 올 수 있다.  
 * 
 * 메소드이름(빈상태/한개/두개 이상)
 * 
 * 
 */

