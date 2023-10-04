package com.week1;

public class WReturn2{
	int i;//전역변수 i이다
	void methodA() {
		int i = 2;//지역변수
		System.out.println("i ===> "+i);
	}
	int methodB() {
		int i = 1;//지역변수 i이다.
		return i;//1
	}
	public static void main(String[] args) {
		WReturn2 w = new WReturn2();
		System.out.println(w.methodB());
		w.methodA(); 
		System.out.println("w.i ===> "+w.i);
	}
}
