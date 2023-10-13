package com.Review;

//  학습목표 "메소드의 파라미터로 참조형 타입을 사용하는 방법" 
class Sonata1{
	int Speed = 0; 
	String carColor = "파랑";
}


public class CarSize {
	
	Sonata1 getCar() 
	{
		return new Sonata1();
		
	}


	public static void main(String[] args) {
		
//		Sonata1 myCar = new Sonata1(); // myCar 객체생성--> 가르키는건 {0, '파랑'}이다.
//		CarSize w = new CarSize(); // w 객체 생성--> getCar메서드 사용가능
//		System.out.println(myCar.carColor); //파랑 출력
//		
//		Sonata1 hercar = w.getCar();
//		System.out.println("==========================");
//		System.out.println(hercar.carColor); 
//		System.out.println(hercar.Speed); 
//		
//		
//		System.out.println("================주소번지 part =========");
//		System.out.println(w);
//		System.out.println(myCar);
//		System.out.println(hercar); 
//		
//		
//		hercar.carColor ="검정색 ";
//		System.out.println(hercar.Speed); 
//		System.out.println(hercar.carColor); 
//		
		

		Sonata1 m1 = new Sonata1();
		CarSize car = new CarSize();
		System.out.println(car);
		System.out.println("===================");
		m1 = car.getCar();
		System.out.println(m1);
		System.out.println(m1.carColor);
		System.out.println(m1.Speed);
		

	}

}
