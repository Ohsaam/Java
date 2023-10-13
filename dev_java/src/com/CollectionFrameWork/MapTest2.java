package com.CollectionFrameWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest2{

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		

		map.put("deptno", "10");
		map.put("dname", "영업부");
		map.put("loc", "부산");
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
		List<Map> l1 = new ArrayList<>();
		

		
	}
}
