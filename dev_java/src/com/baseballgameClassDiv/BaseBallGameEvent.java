package com.baseballgameClassDiv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseBallGameEvent implements ActionListener {
	int cnt = 0;
	BaseBallGameUI bbgUI = null;
	//아래 생성자 호출은 BaseBallGameEvent에서 일어나는게 아니고
	//BaseBallGameUI에서 생성자 호출이 일어난다.
	//그때 파라미터 자리에 this를 넣었다.- 그(BaseBallGameUI의 main메소드에서
	//인스턴스화를 통해 메모리에 로딩된 바로 그 원본이다)
	public BaseBallGameEvent(BaseBallGameUI baseBallGameUI) {
		this.bbgUI = baseBallGameUI;
	}
	//나가기 버튼이나 나가기 메뉴 아이템을 선택(클릭)했을때 호출되는 메소드 구현
	public void exit() {
		System.exit(0);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//너 나가기 버튼 누른거야?
		//화면이 필요하다??- 화면은 어디에 구현했지? BaseBallGameUI
		//복제본이 아니라 메인메소드에서 생성된 바로 그(원본)
		if(bbgUI.jbtn_exit==obj) {
			exit();
		}

	}

}