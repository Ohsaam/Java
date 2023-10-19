package Socketprogramming;

public class ChatClientThread extends Thread {
	ChatClient cc = null;
	public ChatClientThread(ChatClient cc) {
		//아래 초기화를 생략하면 ChatClientThread클래스안에서 ChatClient
		//의 변수나 메소드를 호출할 때 NullPointerException발동
		this.cc = cc;
	}

}
