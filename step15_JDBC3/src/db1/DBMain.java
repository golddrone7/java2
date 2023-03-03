package db1;

public class DBMain {
	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		
		String name = "fff";
		String phone=  "010-666-6666";
		String addr  = "독도";
		
//		추가하기
//		db.addressInsert(name, phone, addr);		
//		수정하기
//		db.addressUpdate(2, "000-0000", "백령도");
		db.addressUpdate(3, "333-3333", "거제시");	
//		삭제하기
		db.addressDelete(4);	
//		전체 목록 조회
		db.addressList();	
	}
}
