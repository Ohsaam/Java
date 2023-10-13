package com.step5;

import java.util.ArrayList;

public class EmpManager {
	ArrayList<EmpDTO> empList = new ArrayList<>();
	
	void getEmpList()
	{
		System.out.println(empList.size()); // 0
		EmpDTO emp = new EmpDTO();
		empList.add(0,emp);
		System.out.println(empList.size());
		emp = new EmpDTO(7566,"나신입", "영업",7800,"2000-10-20",3000,500,10);
		empList.add(1, emp);
		System.out.println(empList.size());
		for(int i = 0; i<empList.size(); i++)
		{
			EmpDTO remp = empList.get(i);
			System.out.println(remp.getEmpno()+ ", " + remp.getEmpno() + "," + remp.getHiredate());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		EmpManager em = new EmpManager(); 
		//자기자신을 인스턴스화 해야만 전역변수의 인식됨.
		em.getEmpList();
	}

}
