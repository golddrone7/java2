package constructor;
/*	클래스명 : UserInfo
 * -name:String
 * -addr:String
 * +UserInfo()
 * +UserInfo(name:String, addr:String)
 * +getter
 */
public class UserInfo {
	private String name;
	private String addr;
	
	
	public UserInfo(){
		System.out.println("***주소록***");
	}

	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}
