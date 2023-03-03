package db2;

import static db2.JdbcTemplate.getConnection;
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//dao : data access object
public class EmpDao {
	
	
//	public void addressList() {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
////		if(conn != null) {
////			System.out.println("연결 성공");
////		}		
//		try {
//			String sql = "select * from addressbook order by num desc";		
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
////			if(rs!=null) System.out.println("결과조회성공");
//			while(rs.next()) {
//				System.out.print(rs.getString("num")+"\t");
//				System.out.print(rs.getString("name")+"\t");
//				System.out.print(rs.getString("phone")+"\t");
//				System.out.println(rs.getString("addr"));
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally{
//			close(rs);
//			close(pstmt);
//			close(conn);
//		}
//	}
	
	public void addressList() {
		Statement stmt = null;
		Connection conn = getConnection();
		ResultSet rs = null;
		String sql = "select * from addressbook";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("phone") + "\t");
				System.out.println(rs.getString("addr") + "\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		
		
		
		
		
	}
	
	
//	public void addressInsert(String name, String phone, String addr) throws IOException {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//
//		
//		String sql = "insert into addressbook(num, name, phone, addr)"
//				+ "values (num_seq.nextval, ?, ?, ?) ";
//		
//		try {
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			
//			int n = pstmt.executeUpdate();
//			if(n>0) {
//				commit(conn);
//				System.out.println(n+"건의 데이터가 추가되었습니다.");
//			}
//			
//		} catch (SQLException e) {
//			rollback(conn);
//			System.out.println("데이터 추가에 실패하였습니다.");
//		} finally {
//				close(pstmt);
//				close(conn);
//		}	
//	}
	public void addressInsert(String name, String phone, String addr) {
		Connection conn = getConnection();
		Statement stmt = null;
		
		String sql = "insert into addressbook "
				+ "values (num_seq.nextval, '"+name+"', '"+phone+"', '"+addr+"')";
		
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if(n>0) {
				commit(conn);
				System.out.println(n+"건의 데이터가 추가되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 추가에 실패했습니다.");
			e.printStackTrace();
		} finally{
			close(stmt);
			close(conn);
		}
	}



//	public boolean addressSearch(String name) {
//		boolean ck=false;
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "select * from addressbook where name=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			rs = pstmt.executeQuery();									
//			while(rs.next()) {
//				System.out.print(rs.getInt("num") + "\t");
//				System.out.print(rs.getString("name") + "\t");
//				System.out.print(rs.getString("phone") + "\t");
//				System.out.println(rs.getString("addr") + "\t");
//				ck=true;
//			}
//		} catch (SQLException e) {
//		} finally {
//			close(rs);
//			close(pstmt);
//			close(conn);
//		}
//		return ck;
//	}

	public boolean addressSearch(String name) {
		boolean ck = false;
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from addressbook where name = '"+name+"'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				ck = true;
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("phone") + "\t");
				System.out.println(rs.getString("addr") + "\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		return ck;
	}


//	public void addressUpdate(String name, String phone, String addr) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		String sql = "update addressbook set phone=?, addr=? where name=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setString(3, name);
//			int n = pstmt.executeUpdate();
//			if(n>0) {
//				commit(conn);
//				System.out.println(n+"건의 데이터의 수정 완료했습니다.");
//			}
//		} catch (SQLException e) {
//			rollback(conn);
//			System.out.println("데이터 수정에 실패했습니다.");
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//	}

	public void addressUpdate(String name, String phone, String addr) {
		Connection conn = getConnection();
		Statement stmt = null;
		
		String sql = "update addressbook "
				+ "set phone='"+phone+"', addr='"+addr+"' where name='"+name+"'";
		
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			
			if(n>0) {
				commit(conn);
				System.out.println(n+"건의 데이터가 수정되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 수정에 실패했습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(conn);
		}
	}

//	public void addressdelete(String name) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		
//		String sql = "delete from addressbook where name=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			int n = pstmt.executeUpdate();
//			if(n>0) {
//				commit(conn);
//				System.out.println(n+"건의 데이터가 삭제되었습니다.");
//			}
//			
//		} catch (SQLException e) {
//			rollback(conn);
//			System.out.println("데이터 삭제에 실패했습니다.");
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//	}
	public void addressdelete(String name) {
		Connection conn = getConnection();
		Statement stmt = null;
		String sql = "delete from addressbook where name='"+name+"'";
		
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if(n>0) {
				commit(conn);
				System.out.println(n+"건의 데이터가 삭제되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 삭제에 실패했습니다.");
			e.printStackTrace();
		} finally {
			close(stmt);
			close(conn);
		}
	}
}
