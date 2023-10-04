package com.Scan;

import java.util.Random;

public class RandomGame {
	int dap = -1; 

	public void newGame()
	{
		Random r = new Random();
		dap = r.nextInt(10); 
	}

	public String account(int User) 
	{
		String hint = null;
		if(dap == User)
		{
			hint = "정답입니다.";
		}
		else if(dap > User) 
		{
			hint = "높여라";
		}
		else if(dap < User) 
		{
			hint = "낮춰라";
		}
		return hint;
	}
	/**********************************************************************************
	 *  판정을 내려주는 메소드 구현하기
	 *  @Param user - 사용자가 숫자를 맞추기 위해서 입력하는 값을 담는 변수다. - 입력할 때마다 바귄다./지역변수
	 *  @return - String 타입 : 힌트를 반환하는 변수 (예시: 높여라 / 낮춰라 / 정답이다.)
	 **********************************************************************************/
	
	public void messagePrint(int User) // User = 5가 복사된다.
	{
		System.out.println(account(User)); 
	}
	
	
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		rg.newGame();
		rg.messagePrint(5);
		


	}

}


/* 0-9사이의 임의의 숫자를 채번하고
 * 사용자로부터 숫자를 입력 받아서 
 * 입력받은 숫자가 더 작으면 힌트를 높여라 라고 출력하고 
 * 더 크면 나줘라 라고 힌트를 주어서 5번까지만 기회를 제공해서 그 숫자를 맞추는 게임을 작성해 보세요.
 * 
 * 새 게임을 선택했을 때는 0~9 사이에 새로운 숫자를 채번해야 한다.
 * 채번한 숫자는 dap라는 변수에 저장해둔다.
 * 그리고 전역변수로 하는 것이 좋다.
 * 왜냐하면 그 게임을 하는 그 사람이 사용하는 동안에는 오직 하나의 객체만 사용하게 되니깐.
 */
