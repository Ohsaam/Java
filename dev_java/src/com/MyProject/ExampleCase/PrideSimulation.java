package com.MyProject.ExampleCase;

class Pride{
  int speed;
}

public class PrideSimulation {

  public void Run(Pride a)
  {
	  
	  System.out.println(a.speed); // 실질적으로 myCar의 값이다. 
    //a = new Pride(); // 새로운 객체가 형성되어 메인이랑 다른 값을 참조 하고 있다.
    



  }



  public static void main(String[] args){
	  
    Pride myCar = new Pride();
    Pride herCar = new Pride();
    Pride himCar = new Pride(); // 총 3개의 객체가 만들어진다

    myCar.speed = 20;
    herCar.speed = 50;
    himCar.speed = 70;

    System.out.println(myCar.speed);
    System.out.println(herCar.speed);
    System.out.println(himCar.speed);

    PrideSimulation test1 = new PrideSimulation();
     
    test1.Run(myCar); // 얘는 지금 20을 가리키고 있음 
    
    
    
    



    
  }

  
}
//getter 메소드는 전역변수에 담긴 값을 꺼낼 때 사용하자.
//setter 메소드는 전역변수가 private이라서 직접 접근이 불가능하니깐
// 메소드의 파라미터 자리를 활용하여 작성한다.