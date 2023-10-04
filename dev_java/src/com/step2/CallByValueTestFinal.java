package com.step2;

class A{
int a = 3;
static String b = "안녕하세요";
}

public class CallByValueTestFinal {

  public static void Hangle(String message)
  {
    message = null;
    A.b = "거짓말입니다";
    System.out.println(A.b);
    A.b = null;
    System.out.println(A.b);

  }
  
  public void effective(A a) // A를 타입으로 사용 가능하다.
  {
    a = new A();
    a.a = 300;
    System.out.println(a.a);


  }



  public static void main(String[] args)
  {

    A a = new A();
    System.out.println(a.a);
    a.a = 7;
    System.out.println(a.a);
    CallByValueTestFinal call = new CallByValueTestFinal(); 
    call.effective(a);

    // ----------- String --------------------------------

    A.b = "무슨 말씀이세요";
    System.out.println(A.b);
   // CallByValueTestFinal.Hangle(A.b);
    CallByValueTestFinal.Hangle(A.b);
    System.out.println(A.b);
    

  }
  


}
