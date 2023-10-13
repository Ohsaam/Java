package com.namoosori;

import java.util.UUID;

public class TravelClub { // 불변객체로서 사용한다.
	
	private static final int MINIMUM = 3;
	
	private String id;
	private String clubname;
	private String foundation;
	private String intro;
	
	/*
	 * 생성자에 대한 디테일
	 */
	private TravelClub()
	{
		/*
		 * why? private -> id가 public 하면 x
		 */
		this.id = UUID.randomUUID().toString();	
		
	}
	
	
	public TravelClub(String clubname, String intro)
	{
		//ID는 HOW? 불러와 -> this를 통해서
		this(); // ID를 불러옴
		setClubname(clubname);
		setIntro(intro);
		this.foundation = foundation;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		if(clubname.length() < MINIMUM) // String의 길이기 때문에 clubname.length()인점을 명심하자.
		{
			System.out.println("3글자 이상 입력하세요");
		}
		this.clubname = clubname;
	}
	
	
	public String getFoundation() {
		return foundation;
	}
	
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	
	public String getIntro() {
		return intro;
	}
	
	public void setIntro(String intro) {
		if(intro.length() < MINIMUM)
		{
			System.out.println("3글자 이상 입력하세요");
		}
		this.intro = intro;
	}
	
	public static int getMinimum() {
		return MINIMUM;
	}
	
	/*
	 * Static으로 메모리에 로딩되는 객체를 하나 생성한다.
	 */
	public static TravelClub sample()
	{
		String clubname = "Incheon";
		String intro = "마계";
		TravelClub tc = new TravelClub(clubname,intro);
		return tc;
	}


	@Override
	public String toString() {
		return super.toString();
	}
	
	
	

}
