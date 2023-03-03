package workshop14;

import static workshop14.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test05 {

	public static void main(String[] args) {
		
		PreparedStatement pstmt = null;
		Connection conn = getConnection();
		String sql = "delete from PRODUCT \r\n"
				+ "where pdno in (select pdno from DISCARDED_PRODUCT)";
		int n;
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
				System.out.println(n+"개의 데이터가 정상적으로 DELETE되엇습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
	}
}
