package Service.logic;

import java.util.List;
import Service.ClubService;
import Service.ServiceLogicLifeCycle;
import entity.TravelClub;
import store.ClubStore;
import store.StoreLifeCycle;

public  class ClubServiceLogic implements ClubService{
	private ClubStore clubStore;

	
	public ClubServiceLogic()
	{
		this.clubStore = StoreLifeCycle.getuniqueInstance().requestClubStore();
	}
	
	@Override
	public void register(TravelClub travelClub) {
		this.clubStore.create(travelClub); // 맵에다 저장 
	}

	@Override
	public List<TravelClub> findAll() {
		
		return this.clubStore.retrieveAll();
		
	}

	@Override
	public List<TravelClub> findName(String clubName) {
		
		return this.clubStore.retrieveAllByName(clubName);

	}

	@Override
	public TravelClub findId(String clubId) {
		
		return this.clubStore.retrieve(clubId);
	}

	@Override
	public void modify(TravelClub modifyClub) {

		this.clubStore.update(modifyClub);
	}
	/*
	 * modify 메소드는 주어진 클럽 ID를 기반으로 현재 등록된 클럽 중에서 해당 클럽을 찾아서 정보를 수정하는 기능을 수행
	 * 클럽의 ID를 기반으로 인덱스를 찾아내고, 해당 인덱스의 클럽 정보를 주어진 modifyClub 객체의 정보로 대체
	 */

	@Override
	public void remove(String clubId) {
		this.clubStore.delete(clubId);
	}
		

}
