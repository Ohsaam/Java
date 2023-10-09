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
			/*
			 * 객체를 사용하여 콘솔에서 사용자로부터 값을 입력받는다.
			 * 용자가 프로그램에 클럽 이름을 제공할 수 있게 해주는 부분이다.
			 */
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
		TravelClub foundClub = null;
		while(true)
		{
			String clubId = consoleutil.getValueOf("Club id to find(0:Club Menu");
			if(clubId.equals("0"))
			{
				break;
			}
			
			foundClub = clubService.findId(clubId);
			
			
			
			if(foundClub != null)
			{
				System.out.println(foundClub.toString());
			}
			else
			{
				System.out.println("Can not find club, ID :" + clubId);
			}
			
		}
	}
	
	public void findName()
	{
		TravelClub[] foundClubs = null;
		while(true)
		{
			String clubname = consoleutil.getValueOf("Club name to find(0:Club Menu");

			if(clubname.equals("0"))
			{
				break;
			}
			
			foundClubs = clubService.findName(clubname);
			
			if(foundClubs != null && foundClubs.length != 0)
			{
				for(TravelClub club : foundClubs)
				{
					System.out.println(club);
				}
				}
			else
			{
				System.out.println("Can not find Club, Name :" + clubname);
			}
			
			}
			
	}
	
	
	/*
	 * findAll 제외하고 나머지는 사용자로부터 값을 입력 받아야함.
	 */
	private TravelClub findOne()
	{
		TravelClub foundClub = null;
		while(true)
		{
			String clubId = consoleutil.getValueOf("Club id to find(0:Club Menu");
			if(clubId.equals("0"))
			{
				break;
			}
			
			foundClub = clubService.findId(clubId);
			
			
			
			if(foundClub != null)
			{
				break;
			}
			else
			{
				System.out.println("Can not find club, ID :" + clubId);
			}
			
		}
		return foundClub;
	}
	
	
	public void modify()
	{//변경하고자 하는 Travel club를 찾아라.
		TravelClub targetClub = findOne(); // 사용자로부터 값을 받고
		String newName = consoleutil.getValueOf("New Club name(0.Club Menu, Enter, No Change");
		
		if(newName.equals("0"))
		{
			return;
		}
		if(!newName.isEmpty()) // 비어 있지 않다면 
		{
			targetClub.setClubName(newName);
		}
		String newIntro = consoleutil.getValueOf("New Club Intro(0.Club Menu, Enter, No Change");
		if(!newIntro.isEmpty())
		{
			targetClub.setIntro(newIntro);
		}
		
		clubService.modify(targetClub);
		System.out.println("Modify Club : " + targetClub.toString());
	}
	
	public void remove()
	{
		
	}
	
	
	
	
}