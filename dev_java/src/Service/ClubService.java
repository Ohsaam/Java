package Service;

import entity.TravelClub;

public interface ClubService {
	
	void register(TravelClub travelClub)
	
	TravelClub[] findAll();
	TravelClub[] findByName(String clubName);
	TravelClub findId(String clubId);
	
	
	void modify(TravelClub modifyClub);
	void remove(String clubId);

}
