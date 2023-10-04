package com.ABCDEFG;

import java.util.Scanner;

/*
 * getFirst 메소드를 선언해서 사용자로 부터 숫자를 입력받는 메소드를 구현해보시오.
 * 
 * Key Point -> 스캐너를 전역변수로 인스턴스화를 한다. [같은 주소번지를 갖는다는점을 잊지말자]
 *  */

class Ball {
    private int value;

    public Ball(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class E
{
	Scanner sc = new Scanner(System.in);
	Ball[] balls = new Ball[3];
	
	public int getFirst()
	{
		int num=0;
		num = sc.nextInt();
		return num; // 전변으로 해야 될까? || 지변으로 해야 될까??
	}
	public int getHap() // 두 수의 합
	{
		int x, y = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		int hap = 0;
		hap = x + y;
		return hap;
	}
	
	public Double getDivide()
	{
		double x, y = 0;
		x = sc.nextDouble();
		y = sc.nextDouble();
		double Divide = 0;
		Divide = sc.nextDouble();
		Divide = x * y / Divide;
		
		return Divide;
	}
	
	public Ball[] getBall()
	{
		for(int i = 0; i < 3; i++)
		{
			int userInput = sc.nextInt();
			balls[i] = new Ball(userInput);
		}
		return balls;
	}
	
	}

public class Emain {
	

	public static void main(String[] args) {
		
		E e = new E();
		int first = e.getFirst();
		System.out.println(first);
		// 두수의 합을 입력받아 사용한다. 
		int hap = e.getHap();
		System.out.println(hap);
		
		double Divide = e.getDivide();
		System.out.println(Divide);
		
		Ball[] arr = e.getBall(); // 배열의 값을 불러온다.
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i].getValue());
			//\ //만약에 어떤 버튼을 눌렀을 때  break 한다.
		}
		
	}

}


/* 0 ~ 9사이의 임의의 숫자를 채번하고 
 * 
 */
