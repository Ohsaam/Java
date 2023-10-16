package com.step6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Annoymous1 extends JFrame {

	JButton jbtn = new JButton("조회");
	public Annoymous1()
	{
		jbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("조회");
			}
				});

		this.add("North",jbtn);
		this.setSize(500,400);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Annoymous1();
	}


	
	

}
