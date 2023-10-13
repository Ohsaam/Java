package com.namoosori;

public interface ClubService {
	
	void register (TravelClub travelclub);
	void modify(TravelClub modify);
	void remove(String clubId);
	
	TravelClub[] findAll();//이름을 반환함
	TravelClub[] findByName(String clubName); // 배열 반환 
	TravelClub findById(String clubId); // 하나만 반환한다.
	
	

	
	

}
