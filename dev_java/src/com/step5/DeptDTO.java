package com.step5;

public class DeptDTO {
	
	private int deptno;
	private String dname;
	private String loc;
	/*
	 * 부서를 먼저 작업을 해야 -> emp를 작업 가능 & 의존관계
	 */
	public DeptDTO(int deptno,String dname, String loc )
	{
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
	}
	
	public DeptDTO()
	{
		
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
