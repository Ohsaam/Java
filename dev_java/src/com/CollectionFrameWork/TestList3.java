package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

// 불변 객체를 통해서 ArrayList를 활용하자!
/*
 * 1. 요구사항. ArrayList를 전역변수로 선언을 하고
 * 2. 인스턴스화를 통해서 이 ArrayList 타입인 Dept를 사용해보자.
 * 
 */
public class TestList3 {
	List<DeptDTO> list = new ArrayList<>();

	public static void main(String[] args) {
		TestList3 t3 = new TestList3();
		/*
		 * 여기서 의문이 발생 할 수 있다. 왜? 인스턴스화를 하지?
		 * list.add(dept) 하면 안 되나? 근데 인스턴스화를 하지 않으면
		 * list라는 전역변수에 선언 되어 있는 t3를 방문하지 않아서 
		 * 인스턴스화를 하지 않으면 객체 자체가 생성되지 않는다. 
		 */
		DeptDTO dept = new DeptDTO();
		dept.setDeptno(10);
		dept.setDname("오지환");
		dept.setLoc("인천");
		t3.list.add(dept);

		DeptDTO dept2 = new DeptDTO();
		dept2.setDeptno(30);
		dept2.setDname("이시원");
		dept2.setLoc("서울");
		t3.list.add(dept2);
		
		System.out.println(dept);
		System.out.println(dept2);
		System.out.println(t3.list.get(0).getDeptno() + ", " + t3.list.get(0).getDname() + ", " + t3.list.get(0).getLoc());
		System.out.println(t3.list.get(1).getDeptno() + ", " + t3.list.get(1).getDname() + ", " + t3.list.get(1).getLoc());

		/*
		 * DeptDTO는 불변객체다. -> 그렇기 때문에 setter / getter 프로퍼티가 선언
		 * 
		 */
		
	}
}
