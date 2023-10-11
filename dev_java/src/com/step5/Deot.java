package com.step5;

class DepT
{
	
	private int deptno;
	private String dname;
	private String loc;
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
	
	public DepT(int deptno, String dname, String loc)
	{
		this.deptno = deptno;
		this.dname = dname;
		this.loc =loc;
	}
	@Override
	public String toString() {
		return "DepT [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	}

public class Deot {
	
	public static void main(String[] args) {
		
		DepT[] dt = new DepT[3];
		
		dt[0] = new DepT(30, "지환", "인천광역시");
		dt[1] = new DepT(40, "금진", "서울");
		
		DepT a = new DepT(70, "연진", "성남");
		dt[2] = a;
		
		for(int i = 0; i<dt.length; i++)
		{
			System.out.println(dt[i].getDeptno() + dt[i].getDname()+dt[i].getLoc());
			System.out.println(dt[i].toString());
			System.out.println("===============================================");
		}
		
	}

	
	
	

}
