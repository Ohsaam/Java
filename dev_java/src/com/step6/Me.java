package com.step6;
//다형성
//같은 메소드를  호출했는데 그 결과가 달라진다.
// me.methodB(), sup1.methodB()
public class Me extends Super1 {
	public void methodC() {
		System.out.println("methodC() 호출");
	}
	public static void main(String[] args) {
		Me me = new Me();
		Super1 sup1 = new Me();
		Super1 sup11 = new Super1();
		System.out.println(me.a);
		me.methodA();
		sup1.methodA();
		//상위 클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드  호출불가함
		sup1.methodC();
		sup11.methodC();
		me.methodC();
	}
}
