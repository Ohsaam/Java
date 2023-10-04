package com.Review;

public class EmpSimulation7 {

	//main메소드에서 인스턴스화 한 Emp의 주소번지(지역변수)를 setEmp 즉 다른 메소드에서 사용하려면  
	//메소드의 파라미터 자리를 이용하세요.
	//만일 이해 되었다면 after에서는 0, null, null이 출력되도록 코드를 변경해 보시오.
	void setEmp(Emp emp) {//Emp emp = null; ->  emp = new Emp();
		//insert here
		emp = new Emp();
		emp.empno = 7566;//0-> 7566
		emp.ename = "Smith";// null-> Smith변경
		emp.job = "영업";// null -> 영업 변경
		System.out.println("====================[[before]]======================");
		System.out.println(emp.empno+", "+emp.ename+", "+emp.job);//7566, Smith, 영업 출력됨
	}//end of setEmp
	public static void main(String[] args) {
		EmpSimulation7 es2 = new EmpSimulation7();//4번 메소드를 호출하기 위해서 인스턴스화 하였음
		Emp emp = new Emp();//사원집합을 관리하는 클래스를 인스턴스화 하였음
		es2.setEmp(emp);//메소드 호출할 때 파라미터로 13번에서 선언한 인스턴스변수를 넘겨줌 0, null, null
		System.out.println("====================[[after]]=======================");
		System.out.println(emp.empno+", "+emp.ename+", "+emp.job);//여기서는  어떤 값들이 출력되는 걸까요?
	}
}
