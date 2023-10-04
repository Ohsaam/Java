package com.step2; // ★★★★

import javax.swing.JFrame;

public class CallByValueTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame s1 = new JFrame();
		s1 = null; // 가비지 컬렉터가 이 부분을 회수해간다. 다르게 생각한다면, 해당 주소값이 참조하는 곳이 없기 때문에 쓰레기 값을 갖는다.
		s1 = new JFrame();
		s1.setTitle("첫번째");
		s1.setSize(300,500);
		s1.setVisible(true);
		// 이 부분 꼭 복습


	}

}
