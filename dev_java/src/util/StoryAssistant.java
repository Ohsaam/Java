package util;

import menu.ClubMenu;

public class StoryAssistant {
	
	private void startStory()
	{
		ClubMenu clubmenu = new ClubMenu();
		clubmenu.show();
	}

	public static void main(String[] args) {
		StoryAssistant assistant = new StoryAssistant();
		assistant.startStory();

	}

}
