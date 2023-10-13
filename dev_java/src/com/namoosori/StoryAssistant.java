package com.namoosori;

public class StoryAssistant {
	public void initDisplay()
	{
		ClubMenu cm = new ClubMenu();
		cm.show();
	}
	
	public static void main(String[] args) {
		StoryAssistant sa = new StoryAssistant();
		sa.initDisplay();
	}

}
