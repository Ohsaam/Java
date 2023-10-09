package Service;

import Service.logic.ClubServiceLogic;

public class ServiceLogicLifeCycle {

	private static ServiceLogicLifeCycle uniqueInstance;
	/*
	 * why ? static으로 선언 했는지는 마무리 되고 알 수 있음
	 * ServiceLogicLifeCycle은 ClubService와 ClubConsole를 알아야 된다.
	 */

	private ClubService clubService;
	
	private ServiceLogicLifeCycle()
	{
		this.clubService = new ClubServiceLogic();
	}

	public ClubService getClubService()
	{
//		if(clubService == null)
//		{
//			clubService = new ServiceLogicLifeCycle();
//		}
		return this.clubService;
	}
	
	public static ServiceLogicLifeCycle getuniqueInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new ServiceLogicLifeCycle();
		}
		
		return uniqueInstance;
	}
	
	/*
	 * 생성자가 private가 되서 인스턴스 할 수 있는 부분은 getuniqueInstance밖에 없다.
	 */
}
