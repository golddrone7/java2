package object;
// setter & getter : 멤버변수 하나당 하나씩 값을 대입하는 setter
// 				    그 값을 리턴하는 getter

class Member{	
	/* 값에 대한 유효성 검사 중요
	 * 	ㄴ 무시하면 4000만원 손실이 있음
	*/
	private String name;
	private int age;
	private double tall;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", tall=" + tall + "]";
	}		
}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("이순신");
		m.setAge(33);
		m.setTall(190.3);
		System.out.println(m.toString());		
	}
}
