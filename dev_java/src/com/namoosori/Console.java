package com.namoosori;

public class Console {
	
	private ConsoleUtil consoleutil;
	private ClubService clubservice;
	
	public Console()
	{
		this.consoleutil =consoleutil;
		this.clubservice= clubservice;
	}
	
	public void register()
	{
		/*
		 * Util로 부터 사용자로부터 입력 받은 값을 받아와야 된다. How 구현?
		 */
		while(true)
		{//consoleutil 클래스 왜 만든거야? 값 받아올려고 
			String clubName = consoleutil.inputStr("(clubName) :0을 누르면 다시 돌아갑니다.");
			if(clubName.equals("0"))
			{
				return;
			}
			String clubIntro = consoleutil.inputStr("(Intro) : 0을 누르면 다시 돌아갑니다");
			
			if(clubIntro.equals(0))
			{
				return ;
			}
			
			TravelClub newclub = new TravelClub(clubName, clubIntro);
			clubservice.register(newclub);
			System.out.println("등록되었습니다. "+ newclub.toString());
			
			
		}
		
		

	}
	
	public void findAll()
	{
		// 전체 찾아온다.
		TravelClub[] clubs = clubservice.findAll();
		if(clubs.length == 0) //만들어진 클럽이 없다면
		{
			System.out.println("Empty");
			return;
		}
		for(TravelClub club : clubs)
		{
			System.out.println(club);
		}
		
	}
	public void findById()
	{
		// 지역변수로 id를 선언한다.
		
		TravelClub foundId = null;
		/*
		 * 반복문을 돌면서 while(true)
		 * {
		 * 		
		 * }
		 * for문을 돌면서 id가 맞는지 확인하고 -> clubservice = findById를 받는다. 
		 */
		

		
		
	}
	
	public void findByName()
	{
		
	}
	

	
}
