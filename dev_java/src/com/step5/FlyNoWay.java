package com.step5;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("나는 날수 없습니다.");
	}

}