package com.week3;

class S
{
	public S(){ }
	
	public S(int i){	}
	
	public S(String s, int i){}
	public S(int i, int j)
	{
		System.out.println(i + " " + j);
	}
	public S(boolean isOk)
	{
		System.out.println(isOk);
	}
	
}
public class SangSungJa01 {

	public static void main(String[] args) {
		
		S s = new S(1,2);
		System.out.println(s);
		s = new S(true);
		System.out.println(s);
		// 두개는 다른 객체다. 

	}

}
