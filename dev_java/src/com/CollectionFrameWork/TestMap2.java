package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap2{

	public static void main(String[] args) {
		List<Map<String, Object>> detpList = new ArrayList<>();

		Map<String, Object> map1 = new HashMap<>();
		map1.put("DEPTNO", 10);
		map1.put("DNAME", "영업부");
		map1.put("LOC", "부산");

		Map<String, Object> map2 = new HashMap<>();
		map2.put("DEPTNO", 20);
		map2.put("DNAME", "개발부");
		map2.put("LOC", "대구");

		detpList.add(map1);
		detpList.add(map2);
		System.out.println(detpList);
	}
}
