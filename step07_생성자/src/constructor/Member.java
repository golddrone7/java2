package constructor;

public class Member {
	private String name ="이순신";
	private int age=25;
	
	public Member() {
	}
	public Member(String string, int i) {
		name = string;
		age = i;
	}
	public void view() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
