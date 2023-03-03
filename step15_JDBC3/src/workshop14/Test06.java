package workshop14;

public class Test06 {
	public static void main(String[] args) {
		FactoryBiz biz = new FactoryBiz("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
		biz.getFactoryAll();
		
		int a[] = new int[3];
		Student a[] = new Student[3];
		
		
		
	}
}
