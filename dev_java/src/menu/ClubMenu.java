package menu;

import java.util.Scanner;

public class ClubMenu {
	private Scanner sc;
	
	public ClubMenu()
	{
		this.sc = new Scanner(System.in);
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
				break;
			
			case 2:
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
			return menuNumber;
		}
		else
		{
			System.out.println("It`s a invalid number --->" + menuNumber);
			return -1;
		}
		

	}

	
}
