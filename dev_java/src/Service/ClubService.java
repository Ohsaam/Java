package Service;

import entity.TravelClub;

public interface ClubService {
	
	void register(TravelClub travelClub);
	
	List<TravelClub> findAll();
	List<TravelClub> findName(String clubName);
	List<TravelClub> findId(String clubId);
	
	
	void modify(TravelClub modifyClub);
	void remove(String clubId);

}
