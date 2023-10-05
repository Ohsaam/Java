package com.step3;
//1부터 10까지의 합을 구하는 프로그램을 작성하시오.
//변수는 몇개가 필요한가요?
//지변으로 할까 아님 전변으로 할까 아님 둘 다 다 된다.
//타입은 뭘로 하지?
public class For2 {

	public static void main(String[] args) {
		int i = 0;
		int hap = 0;//2를 주면 답에 영향이 있다. - 초기화 위치, 값 정확히 해야함
		//for(초기화;조건식;증감연산자) {
		for(i=1;i<=3;i=i+1) {
			hap = hap + i;//위치는 어디에?  for문 안에| for문 밖에 선택
			//답 1 3 6 10 15
			System.out.println(i+", "+hap);
		}
		//hap = 0;
		System.out.println(hap);//6-> 0
		hap = 0;//초기값도 중요하고 초기화 낱말카드의 위치도 중요하다(결과값에 영향이 있다)
		for(i=1;i<=5;i=i+1) {
			hap = hap + i;//위치는 어디에?  for문 안에| for문 밖에 선택
		}
		//
		System.out.println(hap);//15-> 21
	}

}
