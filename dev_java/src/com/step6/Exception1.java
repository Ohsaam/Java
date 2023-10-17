package com.step6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class Exception1 {
 DBConnectionMgr dbMgr =null;
 Connection  con = null;
 PreparedStatement pstmt = null;
 ResultSet rs = null;
	// 여기서 null 값으로 초기화 하는 이유는 사용자로부터 필요할 때 입력 받으려고 
	// new Exception() 했을 때 메모리에 상주된다. -> 이 부분은 몰랐음. 확인 해야함.
	public Exception1()
	{
			dbMgr = DBConnectionMgr.getInstance();
			System.out.println("Exception() " + dbMgr);
			test();
		
	}
	public void test()
	{
		System.out.println("test() : " + dbMgr);
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT Point Me");
		// 인터페이스가 getConnection 호출을 통해서 주소번지를 갖게 되었다. 
		// 메모리에 로딩되었다. ( 로딩되지 않으면 NullPointException 이다. )

		try
		{
			/*
			 * rs.next를 쓰는 이유 
			 */
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 50); // 50번에 커서를 설정한다.
			rs = pstmt.executeQuery();
			System.out.println(rs.next()); // 50번에 데이터가 있니?
			System.out.println(rs.isFirst()); 
			System.out.println(rs.next());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Exception1();
		
	}

}
