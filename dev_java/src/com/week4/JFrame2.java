package com.week4;


class A
{
	JFrame2 jFrame2 = null;
	public A(JFrame2 jFrame2) {
		System.out.println("A(this) 호출");
	}
	
	}

class B
{

			
	public B(JFrame2 jFrame2) {
	}
	}
public class JFrame2 {
	A a = new A(this);

	// main스레드이다. - entry point이다.
	public static void main(String[] args) {
		
		JFrame2 jf = new JFrame2();
		A a1 = new A(jf);

	}

	/*26-디폴트 생성자 - 21 - 7 - 6 - 8("A(this) 호출") - 27 - 7-6-8
	 * 
	 */

}

