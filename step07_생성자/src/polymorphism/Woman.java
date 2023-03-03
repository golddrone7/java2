package polymorphism;

public class Woman extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 나는 여자입니다.");

	}

	public void makeUp() {
		System.out.println("예뻐질 거랍니다.");
		System.out.println("톡톡 촵촵!");
	}
}
