package com.CollectionFrameWork;


import com.step5.EmpDTO;

public class DeptDTO {
	
	private int deptno;
	private String dname;
	private String loc;
	private EmpDTO empdto;
	/*
	 * 부서를 먼저 작업을 해야 -> emp를 작업 가능 & 의존관계
	 */
	public DeptDTO()
	{
		
	}
	
	public DeptDTO(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}


	
	public void setEmpDTO()
	{
		this.empdto =empdto;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
