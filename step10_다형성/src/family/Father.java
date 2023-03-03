package family;

public class Father extends Family implements job {
	public Father() {
		// TODO Auto-generated constructor stub
	}
	public Father(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "일";
	}
	
	public String toString() {
		return super.toString() + "\n아빠는 나가서 " + work() +"을 한다";
	}
	
}
