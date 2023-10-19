package com.step6;

public class A {
	int i = 1;
	void methodB() {
		System.out.println("==========[[methodB]]===========");
		System.out.println(this);
		System.out.println(this.i);
		
		System.out.println("==========[[methodB]]===========");
		
	}
	void methodA() {
		A a2 = new A();
		System.out.println("========================");
		System.out.println(a2);
		System.out.println(this);// 12번
//		System.out.println(this.i);//1
	}
	public static void main(String[] args) {
		A a1 = new A(); // i = 1
		a1 = new A(); // i = 1
		System.out.println(a1); // 23번 주소번지
		a1.i = 2; // 23번 주소번지 + a.i = 2로 바뀜 (원본이 바뀜)
		//a1.methodA(); //
		a1.methodA();
		a1.methodB();
		System.out.println("main");
	}

}
