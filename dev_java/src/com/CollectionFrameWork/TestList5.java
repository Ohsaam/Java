package com.CollectionFrameWork;

import java.util.ArrayList;

import com.step5.EmpDTO;

public class TestList5 {
	ArrayList<EmpDTO> empList = new ArrayList<>();
	
	void getEmpList()
	{
		System.out.println(empList.size()); // 0
		EmpDTO emp = new EmpDTO();
		empList.add(0,emp);
		emp = new EmpDTO();
		empList.add(1, emp);
		System.out.println(empList.size()); // 2
		for(int i = 0; i < empList.size(); i++)
		{
			EmpDTO remp = empList.get(i);
			System.out.println(remp.getComm()+remp.getDeptno());
		}
		
		

		
	}
	
	public static void main(String[] args) {
		
		TestList5 em = new TestList5(); 
		//자기자신을 인스턴스화 해야만 전역변수의 인식됨.
		em.getEmpList();
	}

}
