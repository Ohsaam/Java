package com.step2;

//메소드의 파라미터로 참조형을 사용하는 방법에 대해서 알려주세요.
class Sonata{
	int speed = 0;//현재 소나타는 주차되어 있다.
	String carColor =  "빨강";
}
public class Test2 {
	//메소드의 리턴타입으로 참조형 변수를 사용할 수 있다.
	//메소드 호출을 통해서도 클래스를 메모리에 로딩할 수 있다.
	Sonata getCar() {
		//아래 12번에서 소나타 객체를 생성하여다.
		Sonata himCar = new Sonata();
		//그리고 return으로 그 변수를 반환할 수 있다.
		return himCar;
	}
	public static void main(String[] args) {
		//아래 인스턴스를 한 이유는 getCar()호출하기 위해서 하였다.
		Test2 w = new Test2();
		Sonata myCar = new Sonata();
		System.out.println(myCar.carColor);
		//여기서 getCar메소드를 호출하였고 리턴타입으로 Sonata 객체를 참조하는
		//변수가 선언되었다.
		Sonata himCar = w.getCar();
		System.out.println(myCar);//@4e50df2e
		System.out.println(myCar.carColor);//빨강
		himCar.carColor = "검정색";
		System.out.println(himCar);//@1d81eb93
		//검정색 자동차는 현재 30km달리고 있다
		//빨강색 자동차는 현재 0가리키고 있다.
		System.out.println(himCar.carColor);//검정색
		himCar.speed = 30;
		System.out.println(himCar.speed);//30출력
	}

}

