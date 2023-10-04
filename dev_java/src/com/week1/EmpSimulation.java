package com.week1;
//int의 디폴트값이 0으로 약속된 것처럼 클래스의 디폴트값은 null로 되어있다.
public class EmpSimulation {
	//main메소드에서 출력하던 문장을 empPrint메소드로 꺼내서 처리하시오.
	public void empPrint(Emp emp) {//?자리는 지역변수 자리이다. 호출될때 결정된다.
		System.out.println(emp.empno +", "+emp.ename+", "+emp.job);	
	}
	public static void main(String[] args) {
		EmpSimulation es = new EmpSimulation();
		Emp emp = new Emp();
		// 0, null, null
		System.out.println(emp.empno +", "+emp.ename+", "+emp.job);
		emp.empno = 7566;//초기화, 재정의되었다. 
		emp.ename = "나신입";
		emp.job = "마케팅";
		//System.out.println(emp.empno +", "+emp.ename+", "+emp.job);
		es.empPrint(emp);
		//새로운 신입사원이 한 명 더 입사하였다.
		//그 사원의 사원카드를 작성해 보시오.
		//7499 나초보  매니저
		emp = new Emp();
		emp.empno = 7499;
		emp.ename = "나초보";
		emp.job = "매니저";
		//System.out.println(emp.empno +", "+emp.ename+", "+emp.job);		
		es.empPrint(emp);
	}

}
