	package com.Overriding;
	
	//모든 클래스는 Object클래스를 상속받고 있어서 
	//부모가 가진 메소드를 호출 할 수 있고, 재정의(메소드 오버라이딩) 할 수 있다.
	
	// 메소드 오버로딩
	// 메소드 오버라이딩(단 상속관계인지 따진다.)
	public class Car extends Object{
		
		int speed = 20;
		String carColor = "red";
		@Override
		public String toString()
		{
			return "자식의 차는"+ speed + "차 색깔은"+ carColor+ "이다.";
		}
	
		public static void main(String[] args) {
	
			Car car = new Car();
			System.out.println(car);
			System.out.println(car.toString());
			// Car 클래스에서는 toString() 메소드를 정의하지 않았지만, 부모가 정의하고 있는 메소드라서 나는 호출 할 수 있다.
			
		}
	
	}
