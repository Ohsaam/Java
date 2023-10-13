package com.CollectionFrameWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest3{

	public static void main(String[] args) {
		List<Map<String, Object>> detpList = new ArrayList<>();
		/*
		 * value를 Object로 하는 이유는 여러 타입을 받기 위해서임
		 * Array와 List를 섞어 쓸 수 있음.
		 */
		Map<String, Object> map = new HashMap<>();
		

		map.put("DEPTNO", 10);
		map.put("DNAME", "영업부");
		map.put("LOC", "부산");
		/*
		 * 1. 대문자 소문자 키 값을 항시 확인해야 된다. 그 이유는 소문자 대문자를 구별하기 때문이다.
		 */
		detpList.add(map);
		Set<String> set =map.keySet();
		 Object[] keys =set.toArray();
		 
// 키 값을 덩어리로 꺼낼 수 있다면 반복문을 이용할 수 있다.
		
		for(int i = 0; i < keys.length; i++)
		{
			System.out.println(keys[i] +"=======> " + map.get(keys[i]));
			// 애는 keys.length Col의 개수다. 왜? -> keys--> 는 key이기 때문이다.
			
		}
		
		
		/*
		 * mySql -> 조인의 개념과 같음 -> 쉽게 생각해서 조인한 결과값을 받아오려면 -> List & Map을 섞어쓴다.
		 * 1. List<VO> -> 타입을 맞추지 않아서 되서 연산할 때 주로 사용한다.
		 * 2. List<Map> -> 조인 할 때 주로 사용 || 타입을 맞춰야함
		 */
		System.out.println(detpList.get(0).get("DEPTNO"));
		System.out.println(detpList.get(0).get("dname"));
		System.out.println(detpList.get(0).get("LOC"));
		

		
	}
}
