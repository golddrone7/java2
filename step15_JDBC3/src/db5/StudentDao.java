package db5;

import static db5.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public String insertStudent(StudentEntity studentEntity) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String ck = null;
		String sql = "insert into student values(n_sql.nextval, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentEntity.getName());
			pstmt.setInt(2, studentEntity.getKor());
			pstmt.setInt(3, studentEntity.getEng());
			pstmt.setInt(4, studentEntity.getMat());
			n = pstmt.executeUpdate();
			if(n>0) {
				ck = studentEntity.getName();
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
		return ck;
	}

	public StudentEntity getStudent(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentEntity stu = null;
		
		String sql = "select * from student where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				stu = new StudentEntity();
				stu.setNum(rs.getInt("num"));
				stu.setName(rs.getString("name"));
				stu.setKor(rs.getInt("kor"));
				stu.setEng(rs.getInt("eng"));
				stu.setMat(rs.getInt("mat"));
				stu.setTot(stu.getKor()+stu.getEng() + stu.getMat());
				stu.setAvg(stu.getTot()/3.0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return stu;
	}

	public List<StudentEntity> getStudentList() {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentEntity> list = null;
		StudentEntity stu = null;
		String sql = "select * from student";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs!=null)
				list = new ArrayList<>();
			
			while(rs.next()) {
				stu = new StudentEntity();
				stu.setNum(rs.getInt("num"));
				stu.setName(rs.getString("name"));
				stu.setKor(rs.getInt("kor"));
				stu.setEng(rs.getInt("eng"));
				stu.setMat(rs.getInt("mat"));
				stu.setTot(stu.getKor()+stu.getEng() + stu.getMat());
				stu.setAvg(stu.getTot()/3.0);
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
}
