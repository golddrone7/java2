package workshop14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FactoryDao {
	
	//모든 공장정보를 조회하고 출력한다.
	public void getFactoryAll(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from factory";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs!=null) {
				System.out.println("공장번호\t\t공장명\t\t공장위치");
				System.out.println("---------------------------------------");
			}
			while(rs.next()) {
				String factNo = rs.getString("factno");
				String factName = rs.getString("facname");
				String facLoc = rs.getString("facloc");
				System.out.println(factNo+"\t\t"+factName+"\t"+facLoc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
