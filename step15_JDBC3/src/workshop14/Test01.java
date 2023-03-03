package workshop14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
			conn.setAutoCommit(false);
			
			String sql = "\r\n"
					+ "select pdname, pdsubname,facname,STONAME,nvl(STAMOUNT,0) \r\n"
					+ "from PRODUCT\r\n"
					+ "left join FACTORY using(FACTNO) \r\n"
					+ "left join STORE using(PDNO) \r\n"
					+ "where FACLOC='SEOUL'  and (STAMOUNT is null or STAMOUNT=0)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("제품카테고리\t제품명\t\t공장명\t\t판매점명\t\t판매점재고수량");
			while(rs.next()) {
				String pdname = rs.getString("pdname");
				String pdsubname = rs.getString("pdsubname");
				String facname = rs.getString("facname");
				String stoname = rs.getString("stoname");
				int stamount = rs.getInt(5);
				System.out.println(pdname+"\t\t"+pdsubname+"\t"+facname+"\t"+stoname+"\t\t"+stamount);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
