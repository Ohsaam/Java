package com.step1;

public class DeptSimulation {

		public static void main(String[] args) {
			//타입은 Dept타입인데 주소번지는 서로 달라요
			Dept dept = new Dept();
			dept.deptno = 10;
			dept.dname = "개발부";
			dept.loc = "서울";
			System.out.println(dept);//@4e50df2e
			System.out.println(dept.deptno+", "+dept.dname+", "+dept.loc);//10출력
			dept = new Dept();
			dept.deptno = 20;
			dept.dname = "운영부";
			dept.loc = "대전";
			System.out.println(dept.deptno+", "+dept.dname+", "+dept.loc);//10출력
			System.out.println(dept);//@1d81eb93
			dept = new Dept();
			dept.deptno = 30;
			dept.dname = "기획";
			dept.loc = "제주";
			System.out.println(dept);//@7291c18f
			System.out.println(dept.deptno+", "+dept.dname+", "+dept.loc);//10출력
			


	}

}
