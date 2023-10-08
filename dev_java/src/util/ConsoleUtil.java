package util;

import java.util.Scanner;

public class ConsoleUtil {
	private Scanner sc;
	
	public ConsoleUtil()
	{
		this.sc = new Scanner(System.in);
	}
	/*
	 * 정수 값이 아니라 문자열로 받아서 반환해줄거임.
	 */
	
	public String getValueOf(String label)
	{
		System.out.print(label + " : ");
		String inputStr = sc.nextLine();
		inputStr = inputStr.trim();
		/*
		 * trim은 공백이나 이런 부분들을 생략해준다. 
		 * 제주여행 < 엔터가 들어가는데 엔터부분을 빼준다.
		 * 
		 */
		return inputStr;
	}

}
