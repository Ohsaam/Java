package com.CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TestMap1 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("김철수", 20);
		map.put("안김수",30);
		
		Set<Map.Entry<String, Object>> setentry = map.entrySet();
		Iterator<Map.Entry<String, Object>>iter =setentry.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry<String, Object> setiterator = iter.next();
			String str1 = setiterator.getKey();
			Object obj = setiterator.getValue();
			
			
			System.out.println(str1+"=====>" + obj);
			
			
		}
		
		
		
	}

}
