package com.Review;


class C{
	int i = 1;
}//end of C


public class CSimulation {

	void methodA(C c) {
		c.i = 1;
		System.out.println("methodA ===> " + c.i);
	}
	
	
	public static void main(String[] args) {
		CSimulation cs = new CSimulation();
		C c = new C();
		cs.methodA(c);
		System.out.println("main ===> " + c.i);
	}//end of main
}
