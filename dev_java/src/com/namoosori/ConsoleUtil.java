package com.namoosori;

import java.util.Scanner;

public class ConsoleUtil {
	
	private Scanner sc;
	
	public ConsoleUtil()
	{
		this.sc = new Scanner(System.in);
	}
	
	public String inputStr(String label)
	{
		
		System.out.println(label +" : ");
		String input = sc.nextLine();
		input = input.trim();
		
		return input;
	}

}
