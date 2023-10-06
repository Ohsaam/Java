package com.week4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class TimeServer extends Thread {
	//아래 소켓은 서버소켓에 접속해온 클라이언트의 소켓정보를 쥐고 있다.
	Socket client = null;
	public TimeServer(Socket client) {
		this.client = client;
	}
	@Override
	public void run() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
			while(true) {
				//서버소켓에 접속한 클라이언트 소켓을 가지고 OutputStream을 생성하면 writeObject메소드를 통해서
				//오브젝트단위로 메시지를 쓴다
				oos.writeObject(getTime());
				try {
					sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					try {
						client.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//서버측에서 CalendarAPI 를 이용해 현재 시간 정보를 반환하는 메소드 설계한다
	//반환타입과 리턴타입을 결정해 본다.- 파라미터는 필요없다. -리턴타입은 String한다.
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		return hour + ":" + min + ":"+sec;
	}
	public static void main(String[] args) {
		int port = 3000;
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("해당포트는 이미 사용중입니다.");
			try {
				server.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}///////////////////// end of try
		//여기 까지 진행되었다면 포트도 점유했고 서버소켓도 정상적으로 만들어짐
		System.out.println("TimeServer started successfully...");
		while(true) {
			try {
				client = server.accept();
				if(client !=null) {
					System.out.println(client);
				}
				System.out.println("New client connected...");
				TimeServer ts = new TimeServer(client);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}//////////////////////// end of main //////////////////////


}//end of TimeServer