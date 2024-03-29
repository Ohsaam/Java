package com.ABCDEFG;

// 자바에서는 같은 이름의 메소드를 중복 선언할 수 있다.
// 이것을 가능하게 하는 건 메소드 오버로딩과 메소드 오버라이딩이 있다. 
// 그 이유는 컨벤션이 있기 때문이다.

/*
 * 메소드 오버로딩은 반드시 파라미터의 개수가 다르거나 타입이 달라야한다.
 * 리턴타입이 있고 없고는 메소드 오버로딩에 영향이 없다.
 */
class B{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	
	int hap1() {
		int hap = n1 + n2 + n3;
		return hap;
	}
	
	int hap1(int n1, int n2, int n3) {
		int hap = n1 + n2 + n3;
		return hap;
	}

	
}
public class Bmain {
	public static void main(String[] args) {
		B a = new B();
		int hap = a.hap1();
		System.out.println(hap);
		hap = a.hap1(50, 60, 70);
		System.out.println(hap);
		
	}

}
