package com.step5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//자바를 자바답게 코딩하기 -  재사용성과 이식성
//효과적으로 코딩을 전개하기 - 추상클래스와 인터페이스 설계하고 구현해 나가기
//클래스 사이의 결합도를 낮춰서 단위테스트 가능하게 하고 통합테스트 가능하고 
//그러나서 납품하기(배포하기)
//코드의 양은 늘어나더라도 코드의 복잡도는 늘어나지 않도록 코딩을 했나? 고민 - 코드리뷰 - 좋은습관
import javax.swing.JButton;
import javax.swing.JFrame;

class B1{
	JButton jf = new JButton("수정");
}
class B2{
	JButton ak = new JButton("조회");
}
public class BMain implements ActionListener{
	
	JFrame jf = new javax.swing.JFrame();
	B1 b1 = new B1();
	B2 b2 = null;
	
	BMain(){
		b2 = new B2();

		initDisplay();
	}
	
	
	public void initDisplay() {
		b1.jf.addActionListener(this);
		jf.add("North",b1.jf);
		jf.add("South", b2.ak);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		BMain  bm = new BMain();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == b1.jbtnSelect) {
			System.out.println(b1.jbtnSelect.getText());
		}
	}

}
