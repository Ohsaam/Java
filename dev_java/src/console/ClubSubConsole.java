package console;

import Service.ServiceLogicLifeCycle;

public class ClubSubConsole {
	
	private ClubSubConsole clubservice;
	
	public ClubSubConsole()
	{
		this.clubservice = new ServiceLogicLifeCycle().getClubService();
	}

}
