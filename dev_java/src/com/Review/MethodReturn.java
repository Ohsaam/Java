package com.Review;

//메소드 선언 문장
// (접근제한자 - 생략가능) 리턴타입 메소드이름(파라미터자리,1,2,,,,etc)

// 메소드 선언시 리턴 타입이 오는 자리에 void가 있다면 return예약어 쓸 수 없다.

//해당 부분 복습
// 리턴되는 값이 없다면 다른 메소드에서 그 메소드가 가진 데이터를 재사용할 수 있다.	

public class MethodReturn {
	void MethodA()
	{
		
		MethodB(7);
		
	}
	
	void MethodC()
	{
	}
	int MethodB(int k)
	{
		int j = k;
		return j;

	}
	// 리턴 다음에 오는 코드는 반드시 타입을 맞춰야 한다.
	// 하나만 반환 할 수 있다
	// 만일 여러개의 값을 반환하고 싶다면 참조형 타입을 사용하면된다.

	public static void main(String[] args) {
		// 여기에서 methodB의 반환값을 출력 할 수 있다. 
		
		MethodReturn w = new MethodReturn();
		// 리턴타입이 void가 아닌것은 대입연산자를 써서 반환되는 값을 담을 수 있다.
		int i = w.MethodB(30); 
		//해당 부분도 잘 보게 되면 반환되는 값이랑 리턴타입을 맞춰준걸 볼 수 있다. 해당 부분을 참고하여
		//작성해야된다.
		w.MethodA();
		
		System.out.println(i);
		
		int j = w.MethodB(20); 
		// int 형 변수 선언 ->> w.MethodB도 int형이라서 형이 맞아서 대입된다. 파라미터값도 꼭 보기!
		
		System.out.println(j);

	}

}
