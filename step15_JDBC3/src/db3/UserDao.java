package db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static db3.JdbcTemplate.*;

public class UserDao {
	public List<UserEntity> userList() {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserEntity> list = new ArrayList<>();
		String sql = "select * from userinfo";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserEntity entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
				list.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return list;
	}
	public UserEntity selectUser(String id) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserEntity entity = null;
		String sql = "select * from userinfo where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return entity;
	}
	
	public int insertUser(UserEntity userEntity) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		
		String sql = "Insert into userEntity values"
				+ "(stu_seq.nextval, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userEntity.getId());
			pstmt.setString(2, userEntity.getPasswd());
			pstmt.setString(3, userEntity.getName());
			pstmt.setDouble(4,  userEntity.getScore());
			n = pstmt.executeUpdate();
			
			if(n>0)
				commit(conn);
			
		} catch (SQLException e) {
			rollback(conn);
			n = 0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	
	// id, passwd, name, score
//	public List<UserEntity> userList() {
//		Connection conn = getConnection();
//		Statement stmt = null;
//		ResultSet rs = null;
//		List<UserEntity> list = new ArrayList<>(); /* 중요 */
//		UserEntity entity = null;  /* 중요 */
//		
//		try {
//			String sql = "select * from userinfo";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				entity = new UserEntity();
//				entity.setNum(rs.getInt("num"));
//				entity.setId(rs.getString("id"));
//				entity.setPasswd(rs.getString("passwd"));
//				entity.setName(rs.getString("name"));
//				entity.setScore(rs.getDouble("score"));
//				list.add(entity);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(stmt);
//			close(conn);
//		}
//
//		return list;
//	}

//	public UserEntity selectUser(String id) {
//		Connection conn = getConnection();
//		Statement stmt = null;
//		ResultSet rs = null;
//		UserEntity entity = null;
//		
//		try {
//			String sql = "select * from userinfo where id='"+id+"'";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				entity = new UserEntity(); 
//				// new UserEntity()를 여기서 처리해야 데이터 없다는 것을 처리할 수 있음.
//				// 찾는 데이터가 없음을 명시
//				entity.setNum(rs.getInt("num"));
//				entity.setId(rs.getString("id"));
//				entity.setPasswd(rs.getString("passwd"));
//				entity.setName(rs.getString("name"));
//				entity.setScore(rs.getDouble("score"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(stmt);
//			close(conn);
//		}
//		return entity;
//	}

	
	

//	public int insertUser(UserEntity userEntity) {
//		Connection conn = getConnection();
//		Statement stmt = null;
//		int n=0;
//		try {
//			String sql = "insert into userinfo values"
//					+ "(stu_seq.nextval, '"+userEntity.getId()+"', '"+userEntity.getPasswd()+"',"
//							+ " '"+userEntity.getName()+"', "+userEntity.getScore()+")";
//			
//			stmt = conn.createStatement();
//			n = stmt.executeUpdate(sql);
//			if(n>0)
//				commit(conn);
//		} catch (SQLException e) {
//			rollback(conn);
//			n=0;	//롤백이 완료되면 0으로 처리해줘야 함!
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close(stmt);
//			close(conn);
//		}
//		return n;
//	}

}
