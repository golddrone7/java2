package workshop14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static workshop14.JDBCTemplate.*;
public class Test03 {

	public static void main(String[] args) {
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n;
//		String sql = "insert into DISCARDED_PRODUCT (select PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT,sysdate \r\n"
//				+ "from PRODUCT\r\n"
//				+ "where FACTNO in(select FACTNO\r\n"
//				+ "                        from FACTORY \r\n"
//				+ "                        where FACLOC='CHANGWON'))";
		
		String sql = "create table discarded_product(\r\n"
				+ "	pdno	number	primary key,\r\n"
				+ "	pdname	varchar2(10),\r\n"
				+ "	pdsubname	varchar2(10),\r\n"
				+ "	factno	varchar2(10),\r\n"
				+ "	pdcate	date,\r\n"
				+ "	pdcost	number,\r\n"
				+ "	pdprice	number,\r\n"
				+ "	pdamount	number,\r\n"
				+ "	discarded_date	date,\r\n"
				+ "	foreign key(factno) references factory(factno) \r\n"
				+ ")";
		
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
				System.out.println("커밋 완료");
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
