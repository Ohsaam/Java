package com.CollectionFrameWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest4{

	public static void main(String[] args) {
		List<Map<String, Object>> detpList = new ArrayList<>();
		/*
		 * value를 Object로 하는 이유는 여러 타입을 받기 위해서임
		 * Array와 List를 섞어 쓸 수 있음.
		 */
		Map<String, Object> map = new HashMap<>();
		map.put("DEPTNO", 10);
		map.put("DNAME", "영업부");
		detpList.add(map);
		map = null;
		map = new HashMap<>(); // 복사보니다.
		map.put("LOC", "부산"); // 부산이 how 들어오는가?
		
		map = new HashMap<>();
		map.put("DEPTNO", 20);
		map.put("DNAME", "개발부");
		map.put("LOC", "대구");
		
		detpList.add(map);
		System.out.println(detpList);
		
		


		
	}
}
