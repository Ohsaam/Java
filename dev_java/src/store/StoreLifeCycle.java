package store;

public class StoreLifeCycle {
	private static StoreLifeCycle uniqueInstance;
	
	private ClubStore clubstore;
	
	// 생성자를 private로 하는 이유는 StoreLifeCycle내에서만 사용가능 하게 하려고
	private StoreLifeCycle()
	{
		this.clubstore = new ClubMapStore();
	}
	
	public static StoreLifeCycle getuniqueInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new StoreLifeCycle();
		}
	}

}
