package com.Review;

public class EmpSimulation2 {
	
	
	
	
	void setEmp(Emp emp)//emp의 주소를 받아와서 객체는 그대로 유지 
	{
		// 메소드의 파라미터 자리를 이용하세요
		// 만일 이해 되었다면 after에서는 0, null, null이 출력되도록 코드를 변경해라.
		System.out.println(emp);
		emp.empno = 0; // 0 -> 7655
		emp.ename = "ji"; // null -> Smith
		emp.job = "가출"; // null -> 영업변경
		System.out.println(emp.empno+emp.ename+emp.job);
		

		
	}
	

	
	public static void main(String[] args) {
		
		EmpSimulation2 es2 = new EmpSimulation2();
		Emp emp = new Emp();
		System.out.println(emp);
		es2.setEmp(emp);
		System.out.println(emp.empno+","+emp.ename + "," + emp.job);
		emp.email = "hi";
		emp.empno = 45;
		emp.ename = "oh";
		System.out.println("=========[after]============");
		System.out.println(emp.empno+","+emp.ename + "," + emp.job); 
		System.out.println("=========[after]============");
		es2.setEmp(emp);
		System.out.println("=========[after]============");

		
		System.out.println(emp.email + emp.empno + emp.ename);


	}

} 
