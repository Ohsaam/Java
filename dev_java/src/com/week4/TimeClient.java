package com.week4;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {
	JLabel jlbTime = null;
	public TimeClient() {}
	public TimeClient(JLabel jlbTime) {
		this.jlbTime = jlbTime;
	}
	//콜백메소드 - actionPerformed - 개발자가 직접 호출하지 못한다.
	@Override
	public void run() {
		System.out.println("run호출");
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String timeStr = null;
		try {
			socket = new Socket("172.16.2.3",3000);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				timeStr = ois.readObject().toString();
				System.out.println(timeStr);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}////////end of while ////////////
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}///////////////end of run /////////////////

	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start();
	}

}
