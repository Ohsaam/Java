package com.ABCDEFG;

import javax.swing.JFrame;

public class Frame1 {
	JFrame jf = new JFrame();
	

	void initDisplay()
	{
		System.out.println(jf);
		jf.setSize(500,400);
		jf.setVisible(true);
		
	}
	
	void initDisplay(int width, int height)
	{
		System.out.println(jf);
		jf.setSize(width, height);
		jf.setVisible(true);
		
		

	}
	

	
	void initDjsplay(int width, int height, int isView)
	{
		jf.setSize(width, height);
		
	}
	public static void main(String[] args) {

		Frame1 f = new Frame1();
		f.initDisplay();
		// 값에 의나 호출이다. -> 호출될 때, 지역변수가 초기화 된다.
		
	
	}

}
