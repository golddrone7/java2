package workshop14;
import static workshop14.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Test04 {
	public static void main(String[] args) {
		Connection conn=getConnection();
		PreparedStatement pstmt = null;
		int n;
//		String sql = "delete from PRODUCT \r\n"
//				+ "where pdno in (select pdno from DISCARDED_PRODUCT)";
		String sql = "insert into DISCARDED_PRODUCT (select PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT,sysdate \r\n"
				+ "from PRODUCT\r\n"
				+ "where FACTNO in(select FACTNO\r\n"
				+ "                        from FACTORY \r\n"
				+ "                        where FACLOC='CHANGWON'))";
		
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
				System.out.println(n+"개의 데이터가 정상적으로 INSERT 되었습니다.");
			}
		} catch (SQLException e) {
			System.out.println("롤백");
			rollback(conn);
			e.printStackTrace();
		} finally {
			System.out.println("종료");
			close(pstmt);
			close(conn);
		}
	}
}
