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
	public TravelClub[] findName(String clubName) {
		TravelClub[] createdClubs = Arrays.copyOfRange(clubs,0, index);
		TravelClub[] foundClubs = new TravelClub[createdClubs.length];
		int subIndex = 0;
		
		for(TravelClub club : createdClubs)
		{
			if(club.getClubName().equals(clubName))
			{
				foundClubs[subIndex] = club;
				subIndex++;
			}
		}
		

		return Arrays.copyOfRange(foundClubs, 0, subIndex);
	}

	@Override
	public TravelClub findId(String clubId) {
		TravelClub[] createdClubs = Arrays.copyOfRange(clubs,0, index);
		TravelClub foundClub = null;
		for(TravelClub club : createdClubs)
		{
			if(club.getId().equals(clubId)) {
				foundClub = club;
				break;
			}
		}
		return foundClub;
	}

	@Override
	public void modify(TravelClub modifyClub) {
		// 중요한 것은 바꿔야 되는 파라미터로 넘어오는 modiftClub은 이름과 인트로가 바뀐것.
		// 배열에 있는 클럽중에 몇번 인덱스에 있는 배열을 바꿔줄것인가를 알아야된다.
		
		int foundIndex = 0;
		
		for(int i = 0; i<clubs.length; i++)
		{
			if(clubs[i].getId().equals(modifyClub.getId()))
			{
				foundIndex = i; // 인덱스를 찾음
				break;
			}
		}
		
		this.clubs[foundIndex] = modifyClub;
		
	}

	@Override
	public void remove(String clubId) {

		/*
		 *  a,b,c,d 에서 b를 삭제한다고 가정했을 때, 
		 *  a,c,d -> 앞쪽으로 땡기는 작업이 필요하다. index 활용
		 */
		int foundIndex = 0;
		
		for(int i = 0; i<clubs.length; i++)
		{
			if(clubs[i].getId().equals(clubId))
			{
				foundIndex = i; // 인덱스를 찾음
				break;
			}
		}
		// 찾은 인덱스부터 시작 
		for(int i = foundIndex; i<=this.index; i++)
		{
			clubs[i] = clubs[i+1];
		}
		

		this.index--; //내용을 제거해서 index 
		
	}
	

}
