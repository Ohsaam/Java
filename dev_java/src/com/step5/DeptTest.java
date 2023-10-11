package com.step5;

import java.util.Scanner;

//데이터를 처리하기 위한 클래스 설계 
class DeptVO
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
	
	public DeptVO(int deptno, String dname, String loc)
	{
		this.deptno = deptno;
		this.dname = dname;
		this.loc =loc;
	}
	
	
	
	
}
public class DeptTest {
	

	public static void main(String[] args) {
		
		DeptVO[] dVOs = new DeptVO[3];
		
		
		DeptVO dVO1 = new DeptVO(10,"영업부", "대전");
		dVOs[0] = dVO1;
		
		DeptVO dVO2 = new DeptVO(20,"개발부", "대구");
		dVOs[1] = dVO2;
		
		DeptVO dVO3 = new DeptVO(30, "운영부", "부산");
		dVOs[2] = dVO3;
		
		if(dVO3 == dVOs[2])
			System.out.println("같은 주소 번지다.");
		
		for(int i = 0; i<dVOs.length; i++)
		{
			System.out.println(dVOs[i].getDeptno() + dVOs[i].getDname() + dVOs[i].getLoc());
			
			System.out.println("===============================================");
			
			System.out.println(dVOs[i].toString());
			
		}
		/*
		 * dVOs[i] 하면 당연히 주소번지가 나온다. why? 불변객체기 때문에 getter setter를 사용하여 작성해야 된다.
		 */
		
		int[] k = new int[3];
		
		for(int i =0; i<k.length; i++)
		{
			System.out.println("===============================================");
			System.out.println(k[i]);
		}
		/*
		 * 반면 이 경우는 원시형타입이기 때문에 getter / setter로 구현된 것이 아니라, 사용하는 것이다.
		 */
		
	}

}
