package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* DB연결 과정
 * 1. 드라이버로드 (ojdbc로드)
 * 2. 연결 객체 생성			데이터베이스 ID, PWD에 접근 가능하도록,
 * 3. sql 문장 실행
 * 4. 결과(ResultSet) 리턴
 * 5. 객체 닫기
*/
public class DBConnection {
	Connection conn = null;

	public DBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1. 드라이버로드
			// oracle.jdbc.driver 패키지, OracleDriver 클래스 이름
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234"); // 2. 연결객체생성

			conn.setAutoCommit(false);
			// 잘 기억 해두기!
			if (conn != null)
				System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addressUpdate(int num, String phone, String addr) {
		Statement stmt = null;
		String sql = "update addressbook set phone='" + phone + "', addr='" + addr + "' where num=" + num + "";
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);

			if (n > 0) {
				conn.commit();
				System.out.println(n + "개의 데이터가 수정되었습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
				System.out.println("데이터 수정에 실패했습니다.");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//	public void addressUpdate(int num, String phone, String addr) {
//		PreparedStatement pstmt = null;
//		String sql = "update addressbook set phone=?, addr=? where num=?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setInt(3, num);
//
//			int n = pstmt.executeUpdate();
//
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 업데이트되었습니다.");
//			}
//
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 수정에 실패했습니다.");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}

	public void addressInsert(String name, String phone, String addr) {
		Statement stmt = null;
		String sql = "insert into addressbook(num, name, phone, addr) " + "values (num_seq.nextval,'" + name + "','"
				+ phone + "','" + addr + "')";
//		System.out.println(sql);
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 추가되었습니다.");
			}

		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 추가에 실패되었습니다.");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//	public void addressInsert(String name, String phone, String addr) {		// 테이블 데이터 넣기
//		PreparedStatement pstmt = null;
//		String sql = "insert into addressbook (num, name, phone, addr)"
//				+"values (num_seq.nextval,?, ?, ?)";
//		
//		try {
//			pstmt = conn.prepareStatement(sql); 
//			//sql문장을 db에서 동작하는 pstmt객체로 포장해주는 과정
//			//conn과 pstmt 객체를 연결하는 초기화 작업
//			pstmt.setString(1, name); // 1:첫번째 물음표에 해당하는 값
//			pstmt.setString(2, phone); 
//			pstmt.setString(3, addr);  
//			int n = pstmt.executeUpdate();	// select를 제외한 나머지는 update를 사용, 데이터를 수정하는 작업이기 때문 
//									// select는 executeQuery() 메서드 이용
//			if(n>0) {	// 0이 아닌 양수면 성공
//				conn.commit();
//				System.out.println(n+"건의 데이터가 추가되었습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 추가에 실패하였습니다.");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//				try {
//					if(pstmt!=null) pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}

//  -----------------------------------------Statement	 비효율적		검색
	public void addressList() {
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from addressbook";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("phone") + "\t");
				System.out.println(rs.getString("addr"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//Statement 삭제기능
	public void addressDelete(int num) {
		Statement stmt = null;
		String sql = "delete from addressbook where num = "+num;
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if(n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 삭제되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 삭제에 실패했습니다.");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		} finally {
				try {
					if(stmt!=null)
						stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
//	//PreparedStatement 삭제기능
//	public void addressDelete(int num) {
//		PreparedStatement pstmt = null;
//		String sql = "delete from addressbook where num = ?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
//			int n = pstmt.executeUpdate();
//			if(n>0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 삭제되었습니다.");
//			}
//			
//		
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 삭제에 실패하였습니다.");
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//				try {
//					if(pstmt!=null)
//						pstmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//	}

//  -----------------------------------------PreparedStatement 주로 많이 사용		검색
//	public void addressList() {
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "select * from addressbook"; // 3.sql문장 실행
//		try {
//			pstmt = conn.prepareStatement(sql);
//
//			rs = pstmt.executeQuery(); 	// 4. 결과 리턴
//			while (rs.next()) { // 
////				int num = rs.getInt(1);
////				String name = rs.getString(2);
////				String phone = rs.getString(3);
////				String addr = rs.getString(4);
////						rs.getInt("컬럼명") or rs.getInt(순번)
//				int num = rs.getInt("num");
//				String name = rs.getString("name");
//				String phone = rs.getString("phone");
//				String addr = rs.getString("addr");
//				System.out.print("번호 : " + num);
//				System.out.print("\t\t이름 : " + name);
//				System.out.print("\t핸드폰 : " + phone);
//				System.out.println("\t주소 : " + addr);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		}finally { 	// 5. 연결해제는 finally 블록에서 해줌.
//				try {
//					if(rs!=null) rs.close(); 		
//					// 닫다가 실패하는 경우도 있어서 Exception 처리 해줌
//					if(pstmt!=null) pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			
//		}
//	}
}