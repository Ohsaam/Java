package com.week3;


class Dept
{
	private int deptno;
	private String name;
	private String loc;
	//전변은 초기화를 생략할 수 있다. + 생성자가 대신 해줌

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
	Dept(){}
	
	Dept(int deptno, String name, String loc)
	{
		/*
		 * 현재 메모리에 활성화(언제든 사용이 가능한, 준비가 되어 있는) 
		 * 원본의 객체를 참조하고 있다.
		 * 
		 */
		this.deptno = deptno;
		this.name = name;
		this.loc = loc;
	}
	
	
	
	
	}

public class DeptMain {

	public static void main(String[] args) {
		
		Dept dept = new Dept();
		Dept dept1 = new Dept(10,"개발1팀","부산");
		System.out.println(dept.getDeptno()); // 0
		dept1.setDeptno(100);
		dept1.setName("운영팀");
		dept1.setLoc("인천광역시");
		
		System.out.println(dept1.getDeptno() +":"+dept1.getName()+": "+dept1.getLoc());
	}

}
