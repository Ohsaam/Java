package com.namoosori;

import java.util.Arrays;

public class ClubServiceLogic implements ClubService{

	private TravelClub[] clubs;
	private int index; 
	
	public ClubServiceLogic()
	{
		this.clubs = new TravelClub[10];
		this.index = index;
	}
	@Override
	public void register(TravelClub travelclub) {
		
		clubs[index] = travelclub;
		index++;
		//인덱스를 증가 시킬 때 마다 clubs의 인덱스를 증가시키면서 저장해야함.
		
	}
// 만약에 5개의 배열이 있다고 가정 했을 때 5개를 반환해주면 된다. How? -> Arrays.copyof 이걸 사용하지 않으면 원본 값이 바뀐다.[Range]만큼
	@Override
	public TravelClub[] findAll() {
		
		return Arrays.copyOfRange(clubs, 0, index);
	}

	@Override
	public TravelClub[] findByName(String clubName) {
		TravelClub[] createClub = Arrays.copyOfRange(clubs, 0, index);
		TravelClub[] foundClub = new TravelClub[createClub.length];
		int subindex = 0;
		for(TravelClub a : createClub)
		{
			if(a.getClubname().equals(clubName))
			{
				foundClub[subindex] = clubName;
				subindex++;
			}
		}
		
		return  Arrays.copyOfRange(foundClub,0,subindex);
	}

	@Override
	public TravelClub findById(String clubId) {
		TravelClub[] createclubs = Arrays.copyOfRange(clubs, 0, index);
		TravelClub foundindex = null;
		for(TravelClub a : createclubs)
		{
			if(a.getId().equals(clubId))
			{
				foundindex = clubId;
			}
		}
		
		return foundindex;
		
	}
	



	@Override
	public void modify(TravelClub modify) {
		/*
		 * 1. modify를 진행하게 되면 해당 지역변수를 지속적으로 초기화를 해줘야 while문을 돌면서 해당 값을 초기화 및 찾는 작업을 진행 할 수 있다.
		 * modify-> 사용자가 입력한 값이다.
		 * - TravelClub[] 배열을 사용 할 것 이냐? -> clubs 자체가 존재하는데? -> copy 타입을 만들어야 하는가?
		 */
	
		
		int foundindex = 0; // 변경할 인덱스를 찾는 부분
		for(int  i =0; i < clubs.length; i++)
		{
			if(clubs[i].getId().equals(modify.getId()))
			{
				foundindex = i;
				
			}
			
		}
		

		this.clubs[foundindex] = modify;
		
		
	}

	@Override
	public void remove(String clubId) {
		
		
		int foundindex = 0;
		for(int i = 0; i<clubs.length; i++)
		{
			if(clubs[i].getId().equals(clubId))
			{
				foundindex = i;
			}
		}
		
		for(int i =0; i<this.index; i++)
		{
			clubs[i] = clubs[i+1];
		}
		this.index--;
		
		
	} // 기존의 값들을 삭제하는 곳  
	
	

}
