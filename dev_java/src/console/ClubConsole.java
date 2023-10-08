package console;

import Service.ClubService;
import Service.logic.ClubServiceLogic;
import entity.TravelClub;
import util.ConsoleUtil;

public class ClubConsole {
	
	private ConsoleUtil consoleutil;
	private ClubService clubService;
	
	public ClubConsole()
	{
		this.consoleutil = new ConsoleUtil();
		/*
		 * 이후 변경될 코드입니다.
		 */
		this.clubService = new ClubServiceLogic();
	}
	
	public void register()
	{
		while(true)
		{
			String clubName = consoleutil.getValueOf("Club Name(0.Club Menu)");
			if(clubName.equals("0")) // 돌아가겠다는 의미
			{
				return; 
			}
			String intro = consoleutil.getValueOf("Club Intro(0.Club Menu)");
			if(intro.equals("0"))
			{
				return;
			}
			
			TravelClub newClub = new TravelClub(clubName, intro);
			clubService.register(newClub);
			
			System.out.println("Registered club : " + newClub.toString());
		}
		
		

	}

	
	public void findAll()
	{
		TravelClub[] foundClubs = clubService.findAll();
		if(foundClubs.length == 0)
		{
			System.out.println("Empty");
			return;
		}

		for(TravelClub club : foundClubs)
		{
			System.out.println(club.toString());
		}
	
	}
	
	public void findId()
	{
		
	}
	
	
	/*
	 * findAll 제외하고 나머지는 사용자로부터 값을 입력 받아야함.
	 */
}
