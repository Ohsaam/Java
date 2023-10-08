package entity;

import java.util.UUID;

import javax.sound.midi.SysexMessage;

import util.DateUtil;

public class TravelClub {
	
	private static final int MINIMUM_NAME_LENGTH = 3;
	private static final int MINIMUM_INTRO_LENGTH = 5;
	
	private String id;
	private String clubName;
	private String intro;
	private String foundationDay;
	
	private TravelClub()
	{
		this.id = UUID.randomUUID().toString();
	}
	
	public TravelClub(String clubName, String intro)
	{
		this();
		setClubName(clubName);
		setIntro(intro);
		this.foundationDay = DateUtil.today();
	}
	
	public void setClubName(String clubName)
	{
		if(clubName.length() < MINIMUM_NAME_LENGTH)
		{
			System.out.println("club name should be longer than 3");
			return;
		}
		this.clubName = clubName;
	}

	public String getClubName()
	{
		return this.clubName;
	}
	
	public void setIntro(String intro)
	{
		if(intro.length() < MINIMUM_INTRO_LENGTH)
		{
			System.out.println("club intro should be longer then : " + MINIMUM_INTRO_LENGTH);
			return;
		}
		this.intro = intro;
	}
	
	public String getIntro()
	{
		return this.intro;
	}
	
	public String getId()
	{
		return this.id;
	}
	public String getFoundationDay()
	{
		return this.foundationDay = foundationDay;
	}
	
	public static TravelClub getSample()
	{
		String clubname = "Sample Club";
		String intro = "Sample Club Intro";
		TravelClub sampleclub = new TravelClub(clubname,intro);
		return sampleclub;
				
	}

	@Override
	public String toString() {
		return "TravelClub [id=" + id + ", clubName=" + clubName + ", intro=" + intro + ", foundationDay="
				+ foundationDay + "]";
	}
	
	
}
