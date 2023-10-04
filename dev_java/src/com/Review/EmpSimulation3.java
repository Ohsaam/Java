package com.Review;

public class EmpSimulation3 {

	void setEmp(Emp emp) {
		emp.empno = 9000;
		emp.ename = "JihwanOh";
		emp.job = "영업이다";
		System.out.println("====================[[before]]======================");
		System.out.println(emp.empno+", "+emp.ename+", "+emp.job);
	}
	public static void main(String[] args) {
		EmpSimulation3 es2 = new EmpSimulation3();
		Emp emp = new Emp();
		es2.setEmp(emp);
		System.out.println("====================[[after]]=======================");
		System.out.println(emp.empno+", "+emp.ename+", "+emp.job);
	}
}

