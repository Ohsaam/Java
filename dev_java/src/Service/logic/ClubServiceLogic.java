package Service.logic;

import java.util.Arrays;

import Service.ClubService;
import entity.TravelClub;

public  class ClubServiceLogic implements ClubService{
	private TravelClub[] clubs;
	private int index;

	public ClubServiceLogic()
	{
		this.clubs = new TravelClub[10];
		this.index = 0;
	}
	@Override
	public void register(TravelClub travelClub) {
		clubs[index] = travelClub;
		index++;
		
	}

	@Override
	public TravelClub[] findAll() {
		
		return Arrays.copyOfRange(clubs, 0, index);
		
	}

	@Override
	public TravelClub[] findByName(String clubName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TravelClub findId(String clubId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(TravelClub modifyClub) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String clubId) {
		// TODO Auto-generated method stub
		
	}
	

}
