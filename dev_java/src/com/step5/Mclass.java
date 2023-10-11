package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mclass {
	JFrame jf = new JFrame();
	JButton jbtn = new JButton("조회");
	//JButton jbtn2 = new JButton("조회");
	JButton jbtn2 = jbtn;
	
	public void initDisplay()
	{
		System.out.println(jbtn == jbtn2);
		jf.add(jbtn)
	}
	public static void main(String[] args) {
		
	}

}
