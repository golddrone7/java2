package family;

public class Son extends Family implements job {
	public Son() {
		// TODO Auto-generated constructor stub
	}
	public Son(String name) {
		super(name);
	}
	
	@Override
	public String work() {
		return "공부";
	}
	public String toString() {
		return super.toString() + "\n아들은 " + work() +"를 한다";
	}

}
