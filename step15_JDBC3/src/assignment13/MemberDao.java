package assignment13;

import static assignment13.MyConnectionPool.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	public ArrayList<MemberEntity> getMemberList(){
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberEntity> list = null; 
		String sql = "select * from member2";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs!=null)
				list = new ArrayList<>();
			
			while(rs.next()) {
				MemberEntity entity = new MemberEntity();
				entity.setIdx(rs.getInt("idx"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				list.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return list;
	}
	
	public MemberEntity getMember(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberEntity mem = null;
		String sql = "select * from member2 where name=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs!=null)
				mem = new MemberEntity();
			if(rs.next()) {
				mem.setIdx(rs.getInt("idx"));
				mem.setName(rs.getString("name"));
				mem.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
			close(conn);
		}
		return mem;
	}
	
	public int insertMember(MemberEntity ob) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String sql = "insert into member2 values (mp_idx.nextval, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getName());
			pstmt.setString(2, ob.getPhone());
			n = pstmt.executeUpdate();	
			if(n>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
			n=0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
			close(pstmt);
		}
		return n;
	}
	
	public int deleteMember(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n=0;
		String sql = "delete from member2 where name= ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			n = pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
			n=0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
}