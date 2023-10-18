package com.baseballgame;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 리팩토링 - 해당 코드를 가지고 List<Map>> 구조로 변환 후 
 * 해당 값을 저장한다. 
 */
public class BaseBallLogic {
	private BaseBallLifeCycle lifeCycle;
	BaseBallGameUI baseBallGameUI = null;
	int my[]  = new int[3];
	int com[] = new int[3];
	
	public BaseBallLogic(BaseBallGameUI baseBallGameUI) {
	    this.baseBallGameUI = baseBallGameUI;
	}
    
    public BaseBallLogic()
    {}
	
	
	public void ranCom() {
		Set<Integer> bbNumSet = new HashSet<Integer>();
		while(bbNumSet.size()<3){
			bbNumSet.add( (int)(Math.random() * 9 + 1) );
		}
		
		
		Iterator<Integer> it = bbNumSet.iterator();

		int i = 0; // 배열의 첨자 역할
		while(it.hasNext()){
			com[i++] = it.next().intValue();
			
			// 데이터 섞기 (0번째 자료와 난수번째 자료를 교환하는 방법으로 데이터를 섞는다.)
			for(int j=1; j<=100; j++){  // 작업 회수
				int rnd = (int)(Math.random() * com.length);  // 0 ~ 2 사이의 난수
				int temp = com[0];
				com[0] = com[rnd];
				com[rnd] = temp;
		}

	}}
	
	
	public String account(String user) {
		if(user.length()!=3) {
			return "세자리 숫자를 입력하세요.";
		}
		int temp 	= 0;
		int strike 	= 0;
		int ball 	= 0;
		try {
			temp = Integer.parseInt(user);
		} catch (NumberFormatException e) {
			return "숫자만 입력하세요.";
		}
		my[0] = temp/100;
		my[1] = (temp%100)/10;
		my[2] = temp%10;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(com[i] == my[j]) {
					if(i==j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		if(strike == 3) {
			return "정답입니다. 축하합니다.";
		}
		return strike+"스  "+ball+"볼";
	}
}
