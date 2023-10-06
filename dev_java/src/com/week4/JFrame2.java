package com.week4;

class A
{
	JFrame2 jf = null;
	
	public A(JFrame2 jFrame2) {
		
		System.out.println("A(this) 호출");
		this.jf = jFrame2;
		System.out.println("jf.i : "+jFrame2.i+", this.jf.i:"+this.jf.i);//1을 쥐고 있다|없다
	}
	
	}


			
public class JFrame2 {

	int i = 2;
	
	public JFrame2()
	{
		A a = new A(this);
	}
		
	
	// main스레드이다. - entry point이다.
	public static void main(String[] args) {
		
		JFrame2 jf = new JFrame2();
		System.out.println(jf.i);

	}

	/*32-23-21-25-8-6-10("A(this) 호출") -11-12
	 * 33 (2)
	 * 
	 * 몰랐던 부분 디버깅 시 -> 클래스가 아니라 생성자 먼저 들렸다가(JFrame2) -> 전역변수 들렸다가(i)
	 * 밑에 수행한다.
	 */

}

