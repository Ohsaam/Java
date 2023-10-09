package store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.TravelClub;

public class ClubMapStore implements ClubStore{
	private static final String Iterator = null;
	private Map<String,TravelClub> clubMap;

	public ClubMapStore()
	{
		this.clubMap = new HashMap<>();
	}
	@Override
	public void create(TravelClub travelclub) {

		this.clubMap.put(travelclub.getId(), travelclub);
		/*
		 * map에 저장하는 부분
		 */
	}

	@Override
	public TravelClub retrieve(String clubId) {
		/*
		 * 하나의 클럽만 찾는 부분
		 */
		
		return this.clubMap.get(clubId);
	}

	@Override
	public List<TravelClub> retrieveAllByName(String clubName) {

		/*
		 * 반환할 때 리스트로 반환한다. **특이점**
		 * clubMap에 있는 동일한 이름의 클럽들을 찾아서 List에 담아서 return
		 */
		List<TravelClub> foundclubs = new ArrayList<>();
		
		for(TravelClub club : this.clubMap.values())
		{//this.clubMap.values()는 clubMap의 값(클럽 객체)들을 가져온다.
			if(club.getClubName().equals(clubName))
			{
				foundclubs.add(club);
			}
		}
		
//		java.util.Iterator<TravelClub> iterator = this.clubMap.values().iterator();
//		while(iterator.hasNext())
//		{
//			TravelClub club = iterator.next();
//			if(club.getClubName().equals(clubName))
//			{
//				foundclubs.add(club);
//			}
//		}
		return foundclubs;
	}

	@Override
	public List<TravelClub> retrieveAll() {
		

		return new ArrayList<>(this.clubMap.values());
		/*
		 * clubmap에 있는 값들을 리스트 타입으로 반환한다.
		 */
	}

	@Override
	public void update(TravelClub updateClub) {
		this.clubMap.put(updateClub.getId(), updateClub);
		
	}

	@Override
	public void delete(String clubId) {
		this.clubMap.remove(clubId);
		
	}
	

}
