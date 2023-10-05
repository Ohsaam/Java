package com.week3;

class H
{
	int a;
	Hmain hm = new Hmain(this);

	H(){} // 디폴트 생성자는 파라미터가 없으니깐 생략해도 JVM이 제공함.
	
	
	
	
	}

public class Hmain {

	int b;
	H hm = null;
	//hm를 쓰고 싶음
	/*
	 * 1. 전역변수로 인스턴스화해서 사용한다.
	 * 2. 
	 */
	

	
	public Hmain(H h)
	{
		this.hm = hm;
		b = 20;
	}
	
	public Hmain() {}
	
	 void methodA()
	{
		
		System.out.println(hm); //hm를 쓰고 싶음
	}
	public static void main(String[] args) {
		
		H h = new H();
		Hmain hm = new Hmain(h);
		System.out.println("==============인자1====");
		System.out.println(hm);
		System.out.println(hm.b);
		
		/*
		 * 생성자가 두 번 호출 되는데 자바에서는 메소드 오버로딩이여서 
		 * 같은 이름이여도 다른 생성자 인식함.
		 */
		
		
		hm = new Hmain();
		System.out.println("==============재생성====");
		System.out.println(hm);
		System.out.println(hm.b);
		/*
		 * 0 하고 null이 나오는 이유는 hm을 Hmain에 생성했기 때문에
		 * 해당 부분은 재정의 하는 동작 자체가 없음.
		 * 
		 */
		
		
		hm.methodA(); // null 값 나옴
	// 생성자라는 곳을 거치게 되면 전역변수 값이 바뀐다.

		
	}

}
