package com.step5;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class B1{
	JButton jbn = new JButton("조회");
}
class B2{
	JButton jbn = new JButton("입력");	
}
public class BMain1 implements ActionListener{
	JFrame jf = new JFrame();
	
	public void initDisplay() {
		B1 b1 = new B1();
		B2 b2 = new B2();
		b1.jbn.addActionListener(this);
		jf.add("North", b1.jbn);
		jf.add("South", b2.jbn);
		jf.setSize(400, 500);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		BMain bm = new BMain();
		bm.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
