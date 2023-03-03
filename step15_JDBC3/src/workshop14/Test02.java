package workshop14;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static workshop14.JDBCTemplate.*;


public class Test02 {
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
//		String sql = "select pdsubname, pdcost, pdprice\r\n"
//				+ "from product\r\n"
//				+ "where pdprice > (select pdprice\r\n"
//				+ "		from ( select pdprice\r\n"
//				+ "		          from product\r\n"
//				+ "		        where pdname='TV'\r\n"
//				+ "		        order by 1)\r\n"
//				+ "		where rownum=1)\r\n"
//				+ "			 or\r\n"
//				+ "         pdprice < (select pdprice\r\n"
//				+ "		from ( select pdprice\r\n"
//				+ "		          from product\r\n"
//				+ "		        where pdname='TV'\r\n"
//				+ "		        order by 1 desc)\r\n"
//				+ "		where rownum=1 )";
		String sql = "select PDSUBNAME, PDCOST, PDPRICE \r\n"
				+ "from PRODUCT \r\n"
				+ "where pdcost > any (select pdcost from product where pdname='TV') \r\n"
				+ "                            and pdcost < any (select pdcost from PRODUCT \r\n"
				+ "                            where pdname='CELLPHONE') order by pdcost";
		
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("제품명\t\t\t제품원가\t\t제품가격");
			while(rs.next()) {
				String pdsubname = rs.getString("pdsubname");
				int pdcost = rs.getInt("pdcost");
				int pdprice = rs.getInt("pdprice");
				System.out.println(pdsubname + "\t\t" + pdcost + "\t\t" + pdprice);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			close(rs);
			close(pstmt);
			close(conn);
		}
	}
}
