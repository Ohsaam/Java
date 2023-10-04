package com.exam;

public class Test4 {
	//**********************
	//메인메소드는 콜백이라서 개발자가 호출할 수 없다.
	//**********************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.Run();
		/*
		 * 정리하면 이것도 Static 메소드 이기 때문에, 클래스이름.메소드이름()으로 선언 가능하다.
		 * Ji는 non-static 이기 때문에 인스턴스화 하고 진행하면 된다.
		 * 쉽게 생각하면 static한 메소드에 non-static한 메소드를 사용하기 위해서 인스턴스화를 진행한다.
		 * static한 부분은 클래스이름. 메소드이름() /// 클래스이름.static변수 로 사용 가능하다.
		 */
		P a = new P();
		
		a.Ji();
		
		
		

	}

}
