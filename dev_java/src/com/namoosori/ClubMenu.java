package com.namoosori;

import java.util.Scanner;

public class ClubMenu {
	private Scanner sc;
	private Console console;
	
	
	public ClubMenu()
	{
		this.sc = new Scanner(System.in);
		this.console = console;
	}
	
	
	
	private void display()
	{
		System.out.println("=======================");
		System.out.println("Club Menu");
		System.out.println("=======================");
		System.out.println("1. Register");
		System.out.println("2. Find(All)");
		System.out.println("3. Find(ID)");
		System.out.println("4. Find(Name)");
		System.out.println("5. Modify");
		System.out.println("6. Remove ");
		System.out.println("=======================");
		System.out.println("0. Previous");
		System.out.println("=======================");
	}
	
	
	public void show()
	{
		int inputNumber = 0;
		
		while(true)
		{
			display();
			inputNumber = selectNumber();
			
			System.out.println(inputNumber);
			switch(inputNumber)
			{
			case 1:
				console.register();
				break;
			
			case 2:
				console.findAll();
				break;
				
			case 3:
				console.findById();
				break;
				
			case 4:
				console.findByName();
				break;
//				
//			case 5:
//				console.modify();
//				break;
//				
//			case 6:
//				console.remove();
//				break;
//				
//			case 0:
//				return;
			default:
				System.out.println("Choose agin!!");
			}
		}
	}
	
	
	private int selectNumber()
	{

		System.out.print("Select : ");
		int number = sc.nextInt();
		if( number >= 0 && number <6)
		{
			sc.nextLine();
			return number;
		}
		else
		{
			System.out.println("유효하지 않은 숫자입니다.");
			return -1;
		}
		
		
		}
	}


