package com.step5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Reload1 extends JFrame implements ActionListener{
	
	
	JPanel jp = new JPanel();
	JButton jbtnNew = new JButton("조회");
	JButton jbtn = new JButton("조회");
	

	public void initDisplay()
	{
		jbtnNew.addActionListener(this);
		jp.setBackground(Color.red);
		this.add("Center", jp);
		this.add("North", jbtnNew);
		this.setSize(500,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
		Reload1 r = new Reload1();
		r.initDisplay();
		
	}
	/*
	 * 치환에 대한 예제와 + Candidate에 대한 예제
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == jbtnNew)
		{
			Container cp = this.getContentPane();
			cp.remove(jp);
			JPanel jpCopy = null;
			jp = new JPanel();
			jpCopy =jp;
			this.add("Center", jbtn);
			this.revalidate();
			this.repaint();
		}
		
//		if(e.getSource() == jbtnNew)
//		{
//			Container cp = this.getContentPane();
//			cp.remove(jp);
//			this.add("Center", jbtn);
//			this.revalidate();
//			this.repaint();
//		}
	}

}
