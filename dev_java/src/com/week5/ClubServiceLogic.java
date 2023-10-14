package com.week5;

import java.util.Arrays;
import java.util.List;

import Service.ClubService;
import entity.TravelClub;

public class ClubServiceLogic implements ClubService{
	private TravelClub[] clubs;
	private int index;
	
	ClubServiceLogic()
	{
		this.clubs = new TravelClub[10];
		this.index = index;
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
	public List<TravelClub> findName(String clubName) {
		/*
		 * 이름을 찾아주는 알고리즘은 어떻게 할래 
		 */
		TravelClub[] createclubs = Arrays.copyOfRange(clubs, 0, index);
		TravelClub[] foundIndex = new TravelClub[createclubs.length];
		int subIndex = 0;
		
		for(TravelClub a : createclubs)
		{
			if(a.getClubName().equals(clubName))
			{
				System.out.println("이름를 찾았습니다."+ a);
				foundIndex[subIndex] = createclubs;
				subIndex++;
			}
		}
		return Arrays.copyOfRange(foundIndex, 0, subIndex);
	}

	@Override
	public List<TravelClub> findId(String clubId) {
		TravelClub[] id = Arrays.copyOfRange(clubs, 0, index);
		TravelClub key = null;
		
		for(TravelClub a : id)
		{
			if(a.getId().equals(clubId))
			{
				key = clubId;
				break
			}
		}
		
		return key;
	}

	@Override
	public void modify(TravelClub modifyClub) {
		/*
		 * 중간 인덱스를 기점으로 
		 */

		int foundIndex = 0;
		for(int i =0; i<clubs.length; i++)
		{
			if(clubs[i].getId().equals(modifyClub.getId()))
			{
				foundIndex = i;
				break; // break를 꼭 넣어줘야 한다.
				
				
			}
		}
		
		this.clubs[foundIndex] = modifyClub;
		
	}

	@Override
	public void remove(String clubId) {
		
		int foundIndex = 0;
		for(int i =0; i<clubs.length; i++)
		{
			if(clubs[i].getId().equals(clubId))
			{
				foundIndex = i;
				break;
			}
		}
		
		for(int i =foundIndex; i<this.index; i++)
		{// 여기서 포인트는 this.index다 왜냐하면 삭제를 하는 기준이 foundIndex이기 때문에 this.index까지 진행해야한다.
			clubs[i] = clubs[i+1];
			
		}
		this.index--;
	}

}
