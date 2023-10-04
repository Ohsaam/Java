package com.Review;

public class DeptSimulation {

	public static void main(String[] args) {

		Dept dept = new Dept();
		dept.deptno = 20;
		System.out.println(dept.deptno);
		System.out.println(dept);
				
		dept = new Dept();
		dept.deptno = 50;
		System.out.println(dept.deptno);
		System.out.println(dept);
		
		
		dept = new Dept();
		dept.deptno = 100;
		System.out.println(dept.deptno);

		
		dept = new Dept();
		System.out.println(dept);
		System.out.println(dept.deptno);
		
	

		
	}

}
