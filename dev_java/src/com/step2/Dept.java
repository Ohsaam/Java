package com.step2;

public class Dept {
  private int deptno = 0;
  private String dname = null;;
  private String loc = null;
  
  public void setDeptNo(int deptno) // 담아둔다. ㄴ
  {
    this.deptno = deptno;    
    System.out.println(deptno);
  }
  public void setDname(String dname)
  {
    this.dname = dname;
  }
  public void setloc(String loc)
{
  this.loc = loc;
}

//================================================
  public String getDname()
  {
    return dname;
  }

  public int getDeptno()
  {
    return deptno; // 부서 번호를 담는다. 
  }
  
  public String getloc()
  {
    return loc;
  }


  
}

