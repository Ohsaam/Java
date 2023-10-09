package console;

import Service.ClubService;
import Service.ServiceLogicLifeCycle;

public class ClubSubConsole {
	
	private ClubService clubservice;
	
	public ClubSubConsole()
	{
		this.clubservice = ServiceLogicLifeCycle.getuniqueInstance().getClubService();
	}

}
