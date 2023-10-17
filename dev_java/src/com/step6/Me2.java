package com.step6;
//다형성
//같은 메소드를  호출했는데 그 결과가 달라진다.
// me.methodB(), sup1.methodB()
public class Me2 extends Super2 {
	@Override
	public void methodC() {
		System.out.println("Me2 : methodC() 호출");
	}
	public static void main(String[] args) {
		Me2 me = new Me2();
		Super2 sup1 = new Me2();
		Super2 sup11 = new Super2();
		System.out.println(me.a);
		//Me2타입은 Super2만 상속받았지만 그 전에 Super1을 상속받고 있으므로 Super1에서 정의된 메소드 호출 합법
		me.methodA();
		sup1.methodA();
		//상위 클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드  호출불가함
		//만일 오버라이드 관계에 있어도 불가능한 것인가?
		sup1.methodC();//sup1은 Super2타입인데 생성된 객체는 Me2타입이다 .그래서 헷갈린다
		sup11.methodC();//sup11은 Super2의 정의된 메소드 가 호출됨
		me.methodC();//Me2가 출력될 것이다.
	}
}
