package com.MyProject.ExampleCase;


class Pride1{
  int speed;
  String name;
}

public class PrideSimulation2 {

  public Pride1 Run(Pride1 a) // 클래스 타입 ---- 리턴 타입 
  {
	  //이번엔 클래스로 받아온 값을 재정의 하여 다시 쓰는 연습을 한다.
	  a = new Pride1(); // 객체를 재정의 한다. 객체가 하나 생긴 것. 
	  /*  다시 말하면 이 부분은 Stack에서 객체가 하나 생성되서 기존에 파라미터(클래스)에서 받아 온 값 자체를 
	   *  주소 번지 기준으로 가르키고 있었는데, 재정의 하여 새로운 객체를 할당 및 재정의를 한 것이다. 
	   *  그래서 새로운 객체가 생성된 것.
	   * 
	   */
	  a.speed = 10000;
	  System.out.println(a.speed);
	  return a; // 클래스 참조 변수를 리턴해야함

  }


  

  public static void main(String[] args){
	  
    Pride1 myCar = new Pride1();
    Pride1 herCar = new Pride1();
    Pride1 himCar = new Pride1(); // 총 3개의 객체가 만들어진다

    myCar.speed = 20;
    herCar.speed = 50;
    himCar.speed = 70;
    
    System.out.println(myCar.speed);
    System.out.println(herCar.speed);
    System.out.println(himCar.speed);
    
//    myCar.name = "아우디";
//    herCar.name = "벤츠";
//    himCar.name = "롤스로이스";

   

    PrideSimulation2 test1 = new PrideSimulation2();
     
    System.out.println(myCar.speed);

    test1.Run(myCar); 

    System.out.println(myCar.speed);
    
    myCar = test1.Run(myCar); 

    System.out.println(myCar);
   

    
  }

  
}
//getter 메소드는 전역변수에 담긴 값을 꺼낼 때 사용하자.
//setter 메소드는 전역변수가 private이라서 직접 접근이 불가능하니깐
// 메소드의 파라미터 자리를 활용하여 작성한다.