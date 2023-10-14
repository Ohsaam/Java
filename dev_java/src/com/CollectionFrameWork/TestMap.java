package com.CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("오지환", 20);
		map.put("오지수", 50);
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext())
		{
			Map.Entry<String, Integer> entry = iter.next();
			String str1 = entry.getKey();
			int s = entry.getValue();
			System.out.println(str1 + "," + s);
			
		}
	}
	
}
