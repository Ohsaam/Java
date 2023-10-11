package com.baseballgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseBallGameEvent implements ActionListener{
	
	
	int cnt = 0;
	BaseBallGameUI baseBallGameUI = null;
	
	public BaseBallGameEvent(BaseBallGameUI baseBallGameUI) {
		this.baseBallGameUI = baseBallGameUI;
	}







	public void exit() {
		System.exit(0);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출 성공");
		String label = e.getActionCommand();//감지된 클래스의 라벨담기
		System.out.println("너가 누른 버튼의 문자열은 "+label+ " 입니다.");
		Object obj = e.getSource();//이벤트소스의 주소번지를담아줌.
		System.out.println(obj);
		if("지우기".equals(label)) {
			baseBallGameUI.jta_display.setText("");
		}
		//너 나가기 버튼이니?
		//|만 있을 땐 앞에 조건이 true이면 실행문이 결정되었지만 뒤에 조건을 따짐
		//||가 있을 땐 앞에 조건이 true이면 뒤에 조건이 false이어도 어차피 실행됨 - 뒤에 조건을 안따짐- 일량이 줄어듦
		else if("나가기".equals(label) || obj == baseBallGameUI.jmi_exit) {//or이니까 둘중 하나만 true이어도 호출된다.
			exit();//사용자 정의 메소드 호출이다.
		}
		//새게임을 누른거야?
		else if(obj == baseBallGameUI.jbtn_new) {
			baseBallGameUI.jtf_user.requestFocus();
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==baseBallGameUI.jtf_user) {
			baseBallGameUI.jta_display.append(++cnt+"회 : "+baseBallGameUI.jtf_user.getText()+" : "+baseBallGameUI.bbg.account(baseBallGameUI.jtf_user.getText())+"\n");
			baseBallGameUI.jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==baseBallGameUI.jmi_dap || "정답".equals(label)) {
			//1-먼저 채번(동사-기능-메소드 호출)하고 그 다음에 com배열에 있는 값을 출력해 준다.
			//ranCom();
			baseBallGameUI.jta_display.append("정답은 "+baseBallGameUI.bbg.com[0]+baseBallGameUI.bbg.com[1]+baseBallGameUI.bbg.com[2]+" 입니다.\n");
			//jta_display.append(com[0]+com[1]+com[2]);//0
		}
	}///////////////end of actionPerformed

	
	


}
	
	


