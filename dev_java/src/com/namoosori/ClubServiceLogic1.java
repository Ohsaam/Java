package com.namoosori;

import java.util.Arrays;

public class ClubServiceLogic1 {
	private TravelClub[] clubs;
	private int index;
	
	public ClubServiceLogic1()
	{
		this.clubs = new TravelClub[10];
		this.index = index;
	}
	
	public void register(TravelClub travelclub)
	{
		clubs[index] = travelclub;
		index++;
	}
	
	public TravelClub[] findAll()
	{
		return Arrays.copyOfRange(clubs, 0, index);
	}
	
	

}
