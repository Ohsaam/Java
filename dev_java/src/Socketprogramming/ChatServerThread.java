package Socketprogramming;

import java.net.Socket;

public class ChatServerThread extends Thread {
	ChatServer cs = null;
	
	//생성자의 파라미터
	public ChatServerThread(ChatServer cs) {
		this.cs = cs;
		System.out.println(this.cs.globalList.size());//0
	}	
	
	//run메소드도 콜백메소드 입니다. - 개발자가 직접 호출하지 않아요
	//시스템에서 대신 호출해 줌
	@Override //annotation
	public void run() {
		System.out.println("ChatServerThread 의 run호출");
		//insert here - 듣고 말하기(방송)
		//말하기 처리는 메소드로 분리(for문-3사람)시킨다.
	}
	//서버가 클라이언트에게 들은 것을 방송(여러사람-스레드를 붙임)하는 것이다.
	//왜 파라미터 자리인가? - 매번 입력되는 메세지가 달라진다. - 지역변수
	public void broadCasting(String message) {
		for(int i = 0;i<cs.globalList.size();i++) {//cs.globalList.size()=3
			//클라이언트 들에게 서버가 들은 메시지를 보낸다.- OutputStream
		}
	}

}
