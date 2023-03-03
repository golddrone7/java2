package inheritance;

public class SuperTest {
	private String name;
	private String addr;
	@Override
	public String toString() {
		return "이름은 " + name +"이고 사는곳은 " + addr +"입니다.";
	}
	public SuperTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperTest(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
}
