package com.ABCDEFG;

class A
{// 첫번쨰 학생 점수를 담을 변수 선언한다.
// 전변은 유지된다. 
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int tot = 0;
	void hap1() { // 처리하기 부른다 - > 리턴타입 int, 또는 전변을 굳이 지변으로 처리
		int tot = n1 + n2 + n3;
		this.tot = tot; // ->0-> 240으로 change
		//tot는 지변이라서 다른 외부의 클레스에서는 사용이 불가하다.
		//재사용성이 떨어지는 코드다
	}
}


public class Amain {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.n1);
		a.hap1();
		System.out.println(a.tot);
		
		
		

	}

}

/*
1. 세 학생의 점수를 입력 받아서 -> 변수 3개가 필요하다. -> 전변으로 할까[지변으로 할까]
2. 타입은 어떻게 구성할까?-> 초기화 생략가능 / 하나의 클래스를 대표하는 값이다. 
3. 
*/