package java_20191211.Dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import java_20191211.Dto.EmpDto;

public class EmpDao {
	private static EmpDao single;
	private static String url;
	private static String user;
	private static String password;
	
	static{
		try {
			FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\Java_Fundamental\\src\\jdbc.properties");
			Properties prop = new Properties(); // key = value 형식으로 이루어져 있어야 한다.
			prop.load(fis);
			
			String driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private EmpDao(){}
	public static EmpDao getInstance(){
		if(single == null){
			single = new EmpDao();
		}
		return single;
	}
	public boolean insert(EmpDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			con = DriverManager.getConnection(url, user, password);
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES(?, ?, ?, ?, curdate(), ?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, dto.getNo());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getJob());
			pstmt.setInt(++index, dto.getMgr());
			pstmt.setDouble(++index, dto.getSal());
			pstmt.setDouble(++index, dto.getComm());
			pstmt.setInt(++index, dto.getDeptno());

			pstmt.executeUpdate();
			
			isSuccess = true;
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				close(con, pstmt, null);
				
			}catch(SQLException e){
				
			}
		}
		
		return isSuccess;
	}
	public boolean update(EmpDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			con = DriverManager.getConnection(url, user, password);
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp  ");
			sql.append("SET ename = ?, job = ?, mgr = ?, sal = ?, comm = ?, deptno = ? ");
			sql.append("WHERE empno = ?");
			
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getJob());
			pstmt.setInt(++index, dto.getMgr());
			pstmt.setDouble(++index, dto.getSal());
			pstmt.setDouble(++index, dto.getComm());
			pstmt.setInt(++index, dto.getDeptno());
			pstmt.setInt(++index, dto.getNo());

			pstmt.executeUpdate();
			
			isSuccess = true;
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				close(con, pstmt, null);
				
			}catch(SQLException e){
				
			}
		}
		return isSuccess;
	}
	public boolean delete(int no){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			con = DriverManager.getConnection(url, user, password);
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp ");
			sql.append("WHERE empno = ?");
			
			pstmt = con.prepareStatement(sql.toString());
	
			int index = 0;
			pstmt.setInt(++index, no);
	
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				close(con, pstmt, null);
				
			}catch(SQLException e){
				
			}
		}
		return isSuccess;
	}
	// 행 여러 개
	public ArrayList<EmpDto> select(int start, int len){
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			StringBuffer sql = new StringBuffer();
//			sql.append("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate, '%Y/%m/%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY hiredate DESC ");
			sql.append("LIMIT ?,?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, start);
			pstmt.setInt(++index, len);
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				index = 0;
				int no  = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hiredate = rs.getString(++index);
				double sal = rs.getDouble(++index);
				double comm = rs.getDouble(++index);
				int deptNo = rs.getInt(++index);
				list.add(new EmpDto(no, name, job, mgr, hiredate, sal, comm, deptNo));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					close(con, pstmt, rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return list;
	}
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null)	con.close();
	}
	
	// 한 개의 행
	public EmpDto select(int no){
		EmpDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate, '%Y/%m/%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("where empno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, no);
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				index = 0;
				no  = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hiredate = rs.getString(++index);
				double sal = rs.getDouble(++index);
				double comm = rs.getDouble(++index);
				int deptNo = rs.getInt(++index);
				dto = new EmpDto(no, name, job, mgr, hiredate, sal, comm, deptNo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					close(con, pstmt, rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return dto;
	}
}
