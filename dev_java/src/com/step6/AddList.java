package com.step6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;

import com.google.gson.Gson;




class Emp1
{
	private int empno = 0;
	private String ename = null;
	}

class Dept1{
	private String dname = null;
	}
public class AddList {
	public static void main(String[] args) {
		/*
		 * 선언부와 생성부의 이름이 다르면 다형성을 누릴 수 있다.
		 * 다형성에 대한 전제조건이다.
		 */
		JButton jbtnSelect = new JButton();
		List<JButton> li = new ArrayList<>();
		List<Map<String, Object>> list = new ArrayList<>();		
		Map<String, Object> map = new HashMap<>();
		map.put("empno", 7782);
		map.put("ename", "CLack");
		map.put("dname", "ACCOUNTING");
		list.add(map);
		Gson g = new Gson();
		String temp = g.toJson(list);
		System.out.println(g);
	}

}
