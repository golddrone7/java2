package assignment13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static assignment13.JdbcTemplate.*;
import java.util.ArrayList;

public class StudentDao {
	public ArrayList<Student> getStudentList(){
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Student> list=null;
		String sql = "select mid, name, kor, eng, mat, rank() over(order by (kor+eng+mat) desc) rank from student2";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs!=null)
				list = new ArrayList<>();
			
			while(rs.next()) {
				Student stu = new Student();
				stu.setMid(rs.getInt("mid"));
				stu.setName(rs.getString("name"));
				stu.setKor(rs.getInt("kor"));
				stu.setEng(rs.getInt("eng"));
				stu.setMat(rs.getInt("mat"));
				stu.setRank(rs.getInt("rank"));
				list.add(stu);
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
	
	public Student getStudent(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Student entity = null;
		
		String sql = "select * from student2 where name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs!=null)
				entity = new Student();
			
			if(rs.next()) {
				entity.setMid(rs.getInt("mid"));
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
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
	
	public int insertStudent(Student ob) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n=0;
		String sql = "insert into student2 values (m_mid.nextval, ?, ?, ?, ?)"; // mid, name, kor, eng, mat
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getName());
			pstmt.setInt(2, ob.getKor());
			pstmt.setInt(3, ob.getEng());
			pstmt.setInt(4, ob.getMat());
			n = pstmt.executeUpdate();
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			n=0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
	public int deleteStudent(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n=0;
		String sql = "delete from student2 where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			n = pstmt.executeUpdate();
			if(n>0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			n = 0;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
	
}
