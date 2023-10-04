package com.week1;
//Account클래스는 사용자로 부터 임의의 두 수를 입력 받아서
//두 수의 합을 구하는 메소드를 구현하기 위해 설계되었다.
class Account{
	int first;//이것은 전변이라서 초기화를 하지 않아도 0을 가지고 있다.
	int second;//0
	//int first, second;
	//파라미터를 사용하지 않고 계산한 결과를 구하려면 전변 사용해야 한다.
	//11 번에서 출력하는 문장이 있어도 hap1()메소드를 호출하지 않으면 11번은
	//실행기회를 갖지 못한다.
	public void hap1() {//메소드 호출은 main메소드 안에서 해야 합니다.
		int first = 2;
		int second = 3;
		System.out.println(first + second);//0+0=> 0-> 5
	}
	//아래 메소드는 두 수를 파라미터로 받아서 계산하므로 지변으로 가능하다
	//파라미터 자리에서는 초기화를 할 수 없다.
	//지역변수는 반드시 초기화를 해야만 한다.
	//그럼 언제 어느 위치에서 가능할까요?
	//파라미터 자리의 변수 값은 호출될 때 결정되지만
	//호출되는 메소드 안에서 다른 값으로 변경될 수도 있다.
	public void hap2(int first, int second) {//first=1, second=3넘어왔지만
		//System.out.println(first+seconde);//4
		//first = 0;//재정의 되었다 1이었는데 15을 지나면서 0으로 변했다.
		//second = 1;
		System.out.println(first+second);//1
	}
}//end of Account

public class AccountSimulation {

	public static void main(String[] args) {
		AccountSimulation as2 = new AccountSimulation();
		Account as = new Account();
		as.hap2(0,0);//첫번째 0이 출력되는 메소드 호출한것임
		//메소드 호출할땐 반드시 파라미터 갯수나 타입도 맞춰줘야함
		//as.hap2(0,false);
		//as.hap2(0,"안녕");
		as.hap1();//0을 출력하는 것은 12번 라인에 적힌 문장이 출력해준다.
	}
}
/*
	클래스 안에 메소드가 선언되어 있다고 하더라도 호출하지 않으면 실행되지 않는다.
	다른 메소드 안에서도 다른 클래스에 있는 메소드를 호출할 수 있지만
	우리가 작성한 코드를 실제로 실행하는 것은 JVM이므로 메인메소드 안에서 호출하는
	것이 그 시작이다.
*/











