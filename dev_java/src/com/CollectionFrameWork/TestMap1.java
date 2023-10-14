package com.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("오지환", "낙엽");
		map.put("김철수", "콩나물");
		map.put("홍준표", "대구");
		
		Set<String> keySet = map.keySet(); // 키 값이 들어간거임  
		Object[] keys = keySet.toArray();
		
	
		/*
		 * 키 값 말고 내용 값을 출력하고 싶어
		 */
		// 우선 키값 먼저 출력
		for(int i = 0; i < keys.length; i++)
		{
			System.out.println(keys[i] +"," + map.get(keys[i]));
		}
	}

}
