package com.step4;
//아래 코딩 상황을 그림으로 그려본다.
//GLogic에서 GView의 j를 사용하고 싶다 어떡하지?
//GView에서 GLogic의 i를 사용하고 싶다 어떡해?
//사용자정의 클래스와 자바제공하는 클래스 사이에 활용하기 가능한가?
class GLogic{
	int i = 1;
	GLogic(GView gv){//gv = null
		System.out.println("GLogic : "+gv);//15번 주소번지와 5번 주소번지가 같은거야?
		System.out.println("GLogic i: "+gv.j);//15번 주소번지와 5번 주소번지가 같은거야?
	}
}
public class GView {
	int j = 1;
	GView(){
		//디폴트생성자만 생략가능함- 2번 경유한다.
		GLogic gl = new GLogic(this);//this는 현재 스레드관리하는 클래스이고 원본		
	}
	//15-18-9-11-4-5(출력)-19-9-11-4-5(출력)-20(출력)
	//
	public static void main(String[] args) {
		//static안에서는 this 나 super사용불가 - 생성자에서는 가능함
		//이 때this 는 앞에건가? 아님 뒤에꺼?
		GView gv = new GView();//여기 주번과
		gv = new GView();//여기 주번이 다르다
		gv.j = 10;//서로 다른 값을 가질 수 있다. - 2중적이다 - 좋지않다 - 절대 방어 하려면 -> static으로 하던가 아님 싱글톤 처리하시오.- 메모리 누수
		System.out.println(gv);
	}

}
