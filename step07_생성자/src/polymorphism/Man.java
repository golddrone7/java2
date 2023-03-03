package polymorphism;

public class Man extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 나는 남자입니다.");
	}
	public void enlist() {
		System.out.println("내일 군대를 갑니다.");
		System.out.println("충성!");
	}
}
