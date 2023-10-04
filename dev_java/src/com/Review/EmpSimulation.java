package com.Review;

public class EmpSimulation {
	
	String  her;
	String him;
	int familycnt;
	
	
	

	public static void main(String[] args) {

		Emp emp = new Emp(); // 1
		 emp.empno = 70;
		
		 emp = new Emp(); // 2
		 emp.empno = 100;
		
		
		 emp = new Emp(); // 3개 같은 구조체처럼 3개의 설계도가 작성된다.
		 emp.empno = 2000;

		 
		 EmpSimulation empsimulation = new EmpSimulation();
		 System.out.println("==========================");


		 System.out.println(empsimulation.methodA());  // 주소번지가 나옴 
		 
		 emp = empsimulation.methodA();
		 
		 System.out.println("이메일 입력하세요" +emp.email + "  나이를 입력하세요 : "+ emp.empno + " 이름을 입력하세요 : "+ emp.ename);
		 
		 
		 emp = empsimulation.email(emp); 		
		 System.out.println(emp.empno);
		 System.out.println(emp.ename);
		 System.out.println(emp.email);
		 System.out.println("==========================");
		 
		 System.out.println(emp);
		 System.out.println(emp.email);
		 System.out.println(emp.empno);
		 System.out.println(emp.ename);
		 System.out.println("==========================");

		 emp = empsimulation.ename(emp);
		 System.out.println(emp);
		 System.out.println(emp.email);
		 System.out.println(emp.empno);
		 System.out.println(emp.ename);

		 // methodB을 통해서  값 대입
		 
		 
		 System.out.println("Main 활용 버전 =============================");
		 // 	Emp emp = new Emp();  
		 //    EmpSimulation empsimulation = new EmpSimulation();
		 empsimulation = emp.hi(empsimulation);
		 System.out.println(emp);
		 System.out.println(empsimulation.familycnt);
		 System.out.println(empsimulation.her);
		 System.out.println(empsimulation.him);

		 System.out.println("Main 활용 버전 =============================");
		 
		 empsimulation = emp.ji(empsimulation);
		 System.out.println(emp);
		 System.out.println(empsimulation.familycnt);
		 System.out.println(empsimulation.her);
		 System.out.println(empsimulation.him);
		 

		 
		 
		 
		 
	}
	
	Emp methodA()
	{
		Emp a = new Emp();
		a.ename = "오지환";
		a.empno = 35;
		a.email = "qlwb7187@naver.com";
		return  a;
	}
	
	
	Emp email(Emp email_juso)
	{
		// 이 부분은 재정의가 필요한 부분이 아니라 
		// 파라미터 email을 값으로 받아들여 return 한다.
		
		email_juso.email = "qlwb7187@naver.com";
		email_juso.empno = 40;
		
		return email_juso;
	}
	
	
	
	Emp ename(Emp ename)
	{
		ename = new Emp();
		ename.empno = 50;
		ename.email = "ohjihwan123@naver.com";
		ename.ename = "강산이 변한다";
		return ename;
	}
	
	

	
}
