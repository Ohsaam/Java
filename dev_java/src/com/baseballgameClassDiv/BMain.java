package com.baseballgameClassDiv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class B1
{
	JButton jbtnSelect = new JButton("조회");
	B2 bm = new B2(this);
	
}


class B2
{
	B1 b1 = null;
	
	public B2(B1 b1)
	{
		this.b1 = b1;
	}
	
	JButton jbtnInsert = new JButton("입력");
	
	
	BMain bm = new BMain(this, b1);
	
	}

public class BMain implements ActionListener{
	
	JFrame jf = new javax.swing.JFrame();

	B1 b1 = null;
	B2 b2 = null;
	
	public BMain(B1 b1,B2 b2)
	{
		this.b1 = b1;
		this.b2 = b2;
	}
	
	


	
	public void initDisplay()
	{
		b1.jbtnSelect.addActionListener(this);
		jf.add("North",b1.jbtnSelect);
		jf.add("South", b2.jbtnInsert);
		jf.setSize(500,400);
		jf.setVisible(true);
		System.out.println("initDisplay 호출성공");
	}

	public static void main(String[] args) {
		B1 b1 = new B1();
		B2 b2 = new B2(b1);
		BMain bm = new BMain(b1,b2);
		

		
		
		bm.initDisplay();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * 사용자가 누른 버튼에 대한 주소번지 알아내기
		 * 
		 */
		Object obj = e.getSource();
		if(obj == b1.jbtnSelect)
		{
			System.out.println(b1.jbtnSelect.getText());
		}
		
		
	}

}
