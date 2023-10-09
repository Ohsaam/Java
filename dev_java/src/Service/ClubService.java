package Service;

import entity.TravelClub;

public interface ClubService {
	
	void register(TravelClub travelClub);
	
	TravelClub[] findAll();
	TravelClub[] findName(String clubName);
	TravelClub findId(String clubId);
	
	
	void modify(TravelClub modifyClub);
	void remove(String clubId);

}
