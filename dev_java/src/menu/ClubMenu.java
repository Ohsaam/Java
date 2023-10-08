package menu;

import java.util.Scanner;

import console.ClubConsole;

public class ClubMenu {
	private Scanner sc;
	//클럽 콘솔을 호출하기 위해서 추가하는 것
	private ClubConsole console;
	
	public ClubMenu()
	{
		this.sc = new Scanner(System.in);
		this.console = new ClubConsole();
	}
	
	public void show()
	{
		int inputNumber = 0;
		
		while(true)
		{
			displayMenu();
			inputNumber = selectMenu();
			
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
				
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			case 0:
				return;
			default:
				System.out.println("Choose agin!!");
			}
		}
	}

	
	private void displayMenu()
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
	
	
	private int selectMenu()
	{
		System.out.print("Select : ");
		int menuNumber = sc.nextInt();
		if(menuNumber >= 0 && menuNumber <= 6)
		{
			sc.nextLine();
			/*
			 * nextLine() 하게되면 해당 버퍼를 지운다.
			 */
			return menuNumber;
		}
		else
		{
			System.out.println("It`s a invalid number --->" + menuNumber);
			return -1;
		}
		

	}

	
}
