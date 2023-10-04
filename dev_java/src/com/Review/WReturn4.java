package com.Review; 
// 이 공부의 목적은 Dept 즉 각 enum들로 선언된 전역변수들을 return타입으로 하나만 해도 그 값이 들어가느냐의 문제

class Dept{
	int deptno = 10;
	String dname = "개발부";
	String loc = "부산";	
	
}


class Dept1{
	int deptno = 10;
	String dname = "운영팀";
	String loc = "제주도";	
	
} 



public class WReturn4 {
	
	int getDeptno()
	{
		int deptno = 10;
		return deptno;
	}
	
	String getLoc()
	{
		String loc = "부산";
		return loc;
	}
	
	void getDept(int deptno, String dname, String loc)
	{
		
	}
	
	void getDept(Dept dept)
	{
		
	}
	
	int getDept(int deptno, String dname, String loc)
	{
		return deptno;
	}
	
	Dept getDept()
	{
		Dept dept = null;
		return dept;
	}
	

	public static void main(String[] args) {

		
		
	}

}
