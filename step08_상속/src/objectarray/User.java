package objectarray;

public class User {
	private String name;
	private String addr;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
