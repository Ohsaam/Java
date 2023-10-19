package com.step5;

class Glogic
{
	int j = 1;
	public Glogic(GView gv) { 
		/*
		 * gv = null
		 */
		System.out.println("========SangSungJa=====");
		System.out.println(this.j);
		System.out.println("Glogic : " + gv);
		System.out.println("Glogic. j :" +gv.j);

	}

	
	}

public class GView {

	int j = 10;
	
	public GView()
	{
		Glogic gl = new Glogic(this);
		
		}
	
	public static void main(String[] args) {
		
		GView gv = new GView();
		System.out.println(gv);
		
		gv = new GView();
		gv.j = 20;
		
		System.out.println("============main=========");
		System.out.println(gv);
		System.out.println(gv.j);
	}

}
