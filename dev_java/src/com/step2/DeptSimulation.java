package com.step2; // 요구사항 : 사용자로부터 값을 받는데, 3가지 변수에서 값 자체가 private 할 것. -> 보안상의 문제 

public class DeptSimulation {
  public static void main(String[] agrs)
  {
    Dept dept = new Dept();
    dept.setDeptNo(10); // 단순 정수로 인자를 받는 것이다.
    int deptno = 30; // 전역변수로 deptno 30으로 초기화 그 값을 setDeptNo에서 받고 
    dept.setDeptNo(deptno); // 30으로 초기화
    dept.setDeptNo(4); // deptno -> 4대입[지역변수] -> set-> 그 값을 받고 this.deptno = deptno 에 값을 넣는다.
    dept.setDname("개발부");

    System.out.println(dept.getDeptno());
    String dname = "운영팀";
    dept.setDname(dname);
    System.out.println(dept.getDname());

  }
  
}
