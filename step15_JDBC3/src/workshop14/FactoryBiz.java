package workshop14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryBiz {
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public FactoryBiz() {
	}

	public FactoryBiz(String driver, String url, String user, String pass) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	// 조회에 필요한 Connection 객체를 만들고, FactoryDAO 클래스의 getFactoryAll()를 호출
	public void getFactoryAll() {
		FactoryDao dao = new FactoryDao();
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);
			dao.getFactoryAll(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
