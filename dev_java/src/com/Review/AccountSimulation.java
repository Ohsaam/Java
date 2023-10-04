package com.Review;
//Account클래스는 사용자로 부터 임의의 두 수를 입력 받아서
//두 수의 합을 구하는 메소드를 구현하기 위해 설계되었다.
class Account{
	//파라미터를 사용하지 않고 계산한 결과를 구하려면 전변 사용해야 한다.
	public void hap1() {
		
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
		as.hap2(0,0);
	}

}
