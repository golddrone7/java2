package family;

public class Mother extends Family implements job {
	
	public Mother() {
		// TODO Auto-generated constructor stub
	}
	
	public Mother(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "집안일";
	}
	public String toString() {
		return super.toString() + "\n엄마는 " + work() +"을 한다";
	}

}
