package crudProject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LunchManageDAO extends JdbcDAO{
	//1
	private static LunchManageDAO _dao;
	
	//2 생성자의 은닉화 선언
	private LunchManageDAO() {
		// TODO Auto-generated constructor stub
	}
	
	//3 정적영역에서 클래스의 인스턴스를 생성하여 참조필드에 저장
	static {
		_dao=new LunchManageDAO();
	}
	
	//4 참조필드에 저장된 인스턴스를 반환하는 메소드 작성
	public static LunchManageDAO getDAO() {
		return _dao;
	}
	
	//테이블에 새로운 행으로 삽입, 정보 저장 
	public int insertLunchManage(LunchManageDTO lunchmanage) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="insert into lunchmanage values(?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, lunchmanage.getName());
			pstmt.setString(2, lunchmanage.getPhone());
			pstmt.setString(3, lunchmanage.getAddress());
			pstmt.setString(4, lunchmanage.getDistance());
			pstmt.setString(5, lunchmanage.getMemo());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]insertlunchmanage() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		} return rows;
	}	
	
	//정보 변경 
	public int updateLunchManage(LunchManageDTO lunchmanage) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			String sql="update lunchmanage set name=?,address=?,distance=?,memo=? where phone=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, lunchmanage.getName());
			pstmt.setString(2, lunchmanage.getAddress());
			pstmt.setString(3, lunchmanage.getDistance());
			pstmt.setString(4, lunchmanage.getMemo());
			pstmt.setString(5, lunchmanage.getPhone());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]updatelunchmanage() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		} return rows;
	}
	
	//정보 삭제 
	public int deleteLunchManage(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		
		try {
			con=getConnection();
			
			String sql="delete from lunchmanage where name=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name); //
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]deletelunchmanage() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		} 
		return rows;
	}
	
	// 이름 전달, 해당 이름 검색  
	//=> 단일행 검색 
	public LunchManageDTO selectNameLunchManage(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		LunchManageDTO lunchmanage=null;
		try {
			con=getConnection();
			
			String sql="select * from lunchmanage where name=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name); //
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				//DTO 인스턴스 생성 - 인스턴스 필드에는 기본값 저장 
				lunchmanage=new LunchManageDTO();
				//검색행의 컬럼값을 DTO 인스턴스의 필드값으로 매핑 처리(Oracle >> Java)
				lunchmanage.setName(rs.getString("name"));
				lunchmanage.setPhone(rs.getString("phone"));
				lunchmanage.setAddress(rs.getString("address"));
				lunchmanage.setDistance(rs.getString("distance"));
				lunchmanage.setMemo(rs.getString("memo"));
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectNameLunchManage() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		} 
		return lunchmanage;
	}
	
	//거리 전달
	//=> 단일행 검색 / 다중행 검색 
	public List<LunchManageDTO> selectDistanceLunchManageList(String distance) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<LunchManageDTO> lunchmanagerList=new ArrayList<LunchManageDTO>();
		try {
			con=getConnection();
			
			String sql="select * from LunchManage where distance=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, distance); //
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				LunchManageDTO lunchmanage=new LunchManageDTO();
				lunchmanage.setName(rs.getString("name"));
				lunchmanage.setPhone(rs.getString("phone"));
				lunchmanage.setAddress(rs.getString("address"));
				lunchmanage.setDistance(rs.getString("distance"));
				lunchmanage.setMemo(rs.getString("memo"));
				lunchmanagerList.add(lunchmanage);
			}
		} catch (Exception e) {
			System.out.println("[에러] =selectDistanceLunchManageList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		} 
		return lunchmanagerList;
	}
	
	public List<LunchManageDTO> selectNameManageList(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<LunchManageDTO> lunchmanagerList=new ArrayList<LunchManageDTO>();
		try {
			con=getConnection();
			
			String sql="select * from LunchManage where name=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name); //
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				LunchManageDTO lunchmanage=new LunchManageDTO();
				lunchmanage.setName(rs.getString("name"));
				lunchmanage.setPhone(rs.getString("phone"));
				lunchmanage.setAddress(rs.getString("address"));
				lunchmanage.setDistance(rs.getString("distance"));
				lunchmanage.setMemo(rs.getString("memo"));
				lunchmanagerList.add(lunchmanage);
			}
			
		} catch (Exception e) {
			System.out.println("[에러] =selectDistanceLunchManageList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		} 
		return lunchmanagerList;
	}
	
	private Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	//모든 학생 정보를 검색하여 반환하는 메소드 
	//=> 다중행 검색 
	public List<LunchManageDTO> selectAllLunchManagerList() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<LunchManageDTO> lunchmanagerList=new ArrayList<LunchManageDTO>();
		try {
			con=getConnection();
			
			String sql="select * from lunchmanage order by name";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				LunchManageDTO lunchmanage=new LunchManageDTO();
				lunchmanage.setName(rs.getString("name"));
				lunchmanage.setPhone(rs.getString("phone"));
				lunchmanage.setAddress(rs.getString("address"));
				lunchmanage.setDistance(rs.getString("distance"));
				lunchmanage.setMemo(rs.getString("memo"));
				lunchmanagerList.add(lunchmanage);
			}
		} catch (SQLException e) {
			System.out.println("[에러] =selectAllLunchManageList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return lunchmanagerList; 
	}
}