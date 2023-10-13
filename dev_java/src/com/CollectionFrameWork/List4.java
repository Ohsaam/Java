package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class List4 {
	List<DeptDTO> list = new ArrayList<>(); // DeptDTO불변객체를 제네릭으로 List를 만든다.
	public static void main(String[] args) {
	
		List4 l4 = new List4(); // 만약에 List4에서 -> list 접근하고 싶으면? = l4.list.add/get
		DeptDTO dept = new DeptDTO(); // dept는 getter / setter로 정보입력가능
		dept.setDeptno(50);
		dept.setDname("이경영");
		dept.setLoc("신세계"); // 이렇게 되면 dept 클래스내에 해당 정보가 set된다. 꺼낼때는 ? getter 이용 
		
		/*
		 * list에 dept 제네릭으로 추가하고 싶다. How? -> l4.list.add
		 */
		
		l4.list.add(dept); // 이게 무슨말이냐면 -> 해당 입력값이 list 0 번 인덱스에 저장된다.
		// 0번 인덱스를 꺼내고 싶다? get -> Object 리턴타입이기  때문에 + 타입을 Dept로 하는게 맞음 
		
		DeptDTO rd = l4.list.get(0); // 50,이경영, 신세계를 rd에 저장한다.
		
		System.out.println(rd); // DeptDTO = 불변객체 이기 때문에 -> 주소 타입이 나온다. [list의 주소타입이]
		System.out.println(l4.list); // 이것을 증명하는 내용  -> 해당 내용을 꺼내고 싶어 ㅠㅠ How? -> getter 
		
		System.out.println("Deptno :" + dept.getDeptno() + "  " + "Dname : " + dept.getDname() + " Loc :" + "  "+ dept.getLoc());
		
		dept = new DeptDTO();
		dept.setDeptno(80);
		dept.setDname("이순재할아버지");
		dept.setLoc("충청북도");
		
		l4.list.add(dept); //재정의를 했기 떄문에 [1]에 저장되는게 아님 
		
		DeptDTO d4 = l4.list.get(1);
		System.out.println(d4);
		System.out.println(l4.list);
		System.out.println("Deptno :" + dept.getDeptno() + "  " + "Dname : " + dept.getDname() + " Loc :" + "  "+ dept.getLoc());
		
		
		
		
		
		

	}

}
