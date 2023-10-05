package com.week3;

class K
{
	public K(Kmain km)
	{
		System.out.println("생성자 파트"+km);
		
	}
	}

public class Kmain {

	public static void main(String[] args) {
		Kmain km = new Kmain();
		km = new Kmain();
		System.out.println("main 파트"+km);
		K k = new K(km);
	}

}
