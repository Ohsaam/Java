package Socketprogramming;

import java.util.StringTokenizer;

public class ProtocolTest {

	public static void main(String[] args) {
		String msg = "200|kiwi|tomato|오늘 스터디할까?";
		StringTokenizer st = new StringTokenizer(msg, "|");//token
		//String protocol = st.nextToken();//200
		//String from = st.nextToken();//kiwi
		//String to = st.nextToken();//tomato
		//String msg1 = st.nextToken();//오늘 스터디할까?
		//System.out.println(protocol+", "+from+", "+to+", "+msg1);
		//while(boolean올수있다) {
		while(st.hasMoreElements()) {
			String s = (String)st.nextElement();
			System.out.println(s);
		}
	}

}
