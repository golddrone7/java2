package db4;

import static db4.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class EmpDao {
	
	
	public List<EmpEntity> addressList() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmpEntity entity = null;
		List<EmpEntity> list = null;
		String sql = "select * from addressbook";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs!=null)
				list = new ArrayList<>();
			while(rs.next()) {
				entity = new EmpEntity();
				entity.setNum(rs.getInt(1));
				entity.setName(rs.getString(2));
				entity.setPhone(rs.getString(3));
				entity.setAddr(rs.getString(4));
				list.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		return list;
	}
	
//	public List<EmpEntity> addressList() {
//		Connection conn = getConnection();
//		String sql = "select * from addressbook";
//		PreparedStatement pstmt = null;
//		List<EmpEntity> list = new ArrayList<>();
//		ResultSet rs = null;
//		EmpEntity entity = null;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
////			List를 null로 초기화 할 경우 사용한다.
////			if(rs!=null)
////				list=new ArrayList<>();
//			while(rs.next()) {
//				 entity = new EmpEntity();
//				 entity.setNum(rs.getInt("num"));
//				 entity.setName(rs.getString("name"));
//				 entity.setPhone(rs.getString("phone"));
//				 entity.setAddr(rs.getString("addr"));
//				 list.add(entity);
//			}
//		}
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close(conn);
//			close(rs);
//			close(pstmt);
//		}
//		return list;
//	}
	
	public int addressInsert(EmpEntity entity) {
		int n=0;
		String sql = "Insert into addressbook values (num_seq.nextval, '"+entity.getName()+"', '"+entity.getPhone()+"', '"+entity.getAddr()+"')";
		Connection conn = getConnection();
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			n=0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(conn);
		}
		return n;
	}

	
	
	
	
//	public int addressInsert(EmpEntity entity) {
//		int n=0;
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		String sql = "insert into addressbook values"
//				+ "(num_seq.nextval, ?, ?, ?)";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, entity.getName());
//			pstmt.setString(2, entity.getPhone());
//			pstmt.setString(3, entity.getAddr());
//			n = pstmt.executeUpdate();
//			if(n > 0)
//				commit(conn);
//			
//		} catch (SQLException e) {
//			rollback(conn);
//			n=0;
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close(conn);
//			close(pstmt);
//		}
//		return n;
//	}
	
	public EmpEntity addressSearch(String name) {
		Connection conn= getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmpEntity entity = null;
		String sql = "select * from addressbook where name = '"+name+"'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				entity = new EmpEntity();
				entity.setNum(rs.getInt(1));
				entity.setName(rs.getString(2));
				entity.setPhone(rs.getString(3));
				entity.setAddr(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		return entity;
	}

//	public EmpEntity addressSearch(String name) {
//		EmpEntity entity = null;
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "select * from addressbook where name = ?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				entity = new EmpEntity();
//				entity.setNum(rs.getInt("num"));
//				entity.setName(rs.getString("name"));
//				entity.setPhone(rs.getString("phone"));
//				entity.setAddr(rs.getString("addr"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(conn);
//			close(pstmt);
//			close(rs);
//		}
//		return entity;
//	}
	

//	public int addressUpdate(String name, String phone, String addr) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		int n=0;
//		
//		String sql = "update addressbook set phone=?, addr=? where name=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, phone);
//			pstmt.setString(2,  addr);
//			pstmt.setString(3, name);
//			
//			n = pstmt.executeUpdate();
//			if(n>0)
//				commit(conn);
//			
//				
//		} catch (SQLException e) {
//			rollback(conn);
//			n=0;
//			e.printStackTrace();
//		} finally {
//			close(conn);
//			close(pstmt);
//		}
//		return n;
//	}

//	public int addressDelete(String name) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		int n=0;
//		String sql = "delete from addressbook where name = ?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			n=pstmt.executeUpdate();
//			if(n>0)
//				commit(conn);
//		} catch (SQLException e) {
//			rollback(conn);
//			n=0;
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return n;
//	}

	public int addressUpdate(String name, String phone, String addr) {
		Connection conn = getConnection();
		Statement stmt = null;
		int n = 0;
		String sql = "update addressbook set phone = '"+phone+"', addr = '"+addr+"' where name = '"+name+"'";
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			n=0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(conn);
		}
		return n;
	}

	public int addressDelete(String name) {
		int n=0;
		Connection conn = getConnection();
		Statement stmt = null;
		String sql = "delete from addressbook where name = '"+name+"'";
		
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(conn);
			close(stmt);
		}
		return n;
	}
}
