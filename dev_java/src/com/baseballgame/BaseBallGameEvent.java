package com.baseballgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseBallGameEvent implements ActionListener {
	int cnt = 0;
    BaseBallGameUI gameUI = null;
    BaseBallLogic gameLogic = null;
	
	public BaseBallGameEvent()
	{
		
	}
    public BaseBallGameEvent(BaseBallGameUI gameUI, BaseBallLogic gameLogic) {
        this.gameUI = gameUI;
        this.gameLogic = gameLogic;
    }

    public void setGameUI(BaseBallGameUI gameUI) {
        this.gameUI = gameUI;
    }
	//나가기 버튼이나 나가기 메뉴 아이템을 선택(클릭)했을때 호출되는 메소드 구현
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
			gameUI.jta_display.setText("");//화면측 - BaseBallGameUI
		}
		//너 나가기 버튼이니?
		//|만 있을 땐 앞에 조건이 true이면 실행문이 결정되었지만 뒤에 조건을 따짐
		//||가 있을 땐 앞에 조건이 true이면 뒤에 조건이 false이어도 어차피 실행됨 - 뒤에 조건을 안따짐- 일량이 줄어듦
		else if("나가기".equals(label) || obj == gameUI.jmi_exit) {//or이니까 둘중 하나만 true이어도 호출된다.
			exit();//사용자 정의 메소드 호출이다.
		}
		//새게임을 누른거야?
		else if(obj == gameUI.jbtn_new || obj == gameUI.jmi_new) {
			cnt = 0;
			//순환구조에 빠지지 않도록 하기 위해서 Logic클래스와 Event클래스는 직접 연결하지 않음
			gameUI.gameLogic.ranCom();
			gameUI.jta_display.setText("");
			gameUI.jta_display.append("정답은 "+gameUI.gameLogic.com[0]+gameUI.gameLogic.com[1]+gameUI.gameLogic.com[2]+" 입니다.\n");
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==gameUI.jtf_user) {
			gameUI.jta_display.append(++cnt+"회 : "+gameUI.jtf_user.getText()+" : "+gameUI.gameLogic.account(gameUI.jtf_user.getText())+"\n");
			gameUI.jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==gameUI.jmi_dap || "정답".equals(label)) {
			//ranCom();
			gameUI.jta_display.append("정답은 "+gameUI.gameLogic.com[0]+gameUI.gameLogic.com[1]+gameUI.gameLogic.com[2]+" 입니다.\n");
		}
	}

}
