package com.ABCDEFG;

class C{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
}
/*
 * C1클래스에서는 C클ㄹ스에서 전달 받은 데이터를 가지고 총합을 구하는 메소드 선언하였다.
 * 그런데 같은 이름의 메소드를 2개 정의함 -> 메소드 오버로딩
 */
class C1{
	int hap1() {
		/*
		 * hap1메소드 안에서 데이터를 갖는 C클래스를 인스턴스화 하였다. -> main 없음
		 * 
		 */
		C c = new C();
		int hap = c.n1 + c.n2 + c.n3; // 데이터를 쥐고 있는 클래스를 지변으로 인스턴스화 하였다.
		return hap;
	}

	int hap1(C c ) { 
		c.n1 = 40;
		c.n2 = 200;
		c.n3 = 700;
		int hap = c.n1 + c.n2 + c.n3;
		return hap;
	}	
}
public class Cmain {
	public static void main(String[] args) {
		C c = new C();
		C1 a = new C1();
		int hap = a.hap1();
		System.out.println(hap);
		c.n1 = 50;
		c.n2 = 60;
		c.n3 = 50;
		hap = a.hap1(c); // 지변으로 선언된 변수를 다른 메소드에서 사용된다.
		System.out.println(c.n2); //원본값이 바뀐겨 
		System.out.println(hap);
	}

}