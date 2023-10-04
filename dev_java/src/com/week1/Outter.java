package com.week1;

public class Outter {
	int x = 2;
	static class Inner{
		int i = 1;
		public void methodA() {
			
		}
	}
	public static void main (String args[]) {
		Inner inner = new Inner();
		System.out.println(inner.i);
		System.out.println(inner.i);
	}
}
