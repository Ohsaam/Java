package com.collectionFramework2;

import java.awt.desktop.SystemSleepListener;
import java.util.HashMap;
import java.util.Map;

public class MapExam1 {
	
	
	public static void main(String[] args) {
		Map <String, Object> map = new HashMap<>();
		
		/*
		 * 값을 넣으려면 put // 뺴려면 get
		 */
		
		map.put("DEPTNO", 1);
		map.put("go",10);
		map.put("su",15);
		
		System.out.println(map.get("DEPTNO"));
		System.out.println(map.get("go"));
		System.out.println(map.get("su"));
		System.out.println(map.containsKey("DEPTNO"));

		/*
		 * 키 값은 중복되면 안 된다. -> <String,String>으로 제한 했을 때 -> 값이 제한적임 그래서 Value를-Object로 사용
		 * get 사용 시 key값이 나와야함
		 */
	}

}
