package com.Review;

//  학습목표 "메소드의 파라미터로 참조형 타입을 사용하는 방법" --> 설명해보기
class Sonata{
	int Speed = 0; // 현재 소나타는 주차되어 있다.
	String carColor = "빨강";
}


public class WReturn3 {
	
	Sonata getCar() //리턴타입이 클래스 
	{
		// 아래 12번에서 소나타 객체를 생성하였다.
		Sonata himcar = new Sonata();
		himcar.carColor = "노랑";
		// 그리고 return으로 그 변수를 반환 할  수 있다.
		return himcar;
		
		//return new Sonata(); == 같은 말 || Sonata himcar = new Sonata(); return himcar
	}


	public static void main(String[] args) {
		
		Sonata myCar = new Sonata();
		//  아래 인스턴스를 호출한 이유는 getCar()호출하기 위해서 하였다.
		WReturn3 w = new WReturn3();
		System.out.println(myCar.carColor);
		// 여기서 getCar메소드를 호출하였고 리턴타입으로 Sonata 객체를 참조하는 변수가 선언되었다.
		Sonata hercar = w.getCar();
	
		
		/*
		 * 쉽게 생각해서 이 부분은 getCar에서 리턴을 himcar, 즉 Sonata로 클래스로 리턴했기 때문에 새로운 객체를 생성했고 
		 */
		
		
		// 검정색 자동차는 현재 30km달리고 있다.
		// 빨강색 자동차는 현재 0을 가리키고 있다.
		
		System.out.println(hercar); // @4e50df2e
		System.out.println(hercar.carColor); // 빨강

		hercar.carColor ="검정색 ";
		System.out.println(hercar); // @1d81eb93
		System.out.println(hercar.carColor); 

		
		
		

		

	}

}
