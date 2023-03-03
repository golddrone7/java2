package constructor;

/* 생성자가 여러개일 때 다른 생성자의 호출이 가능
 * 이때 this 사용
 * 객체가 자기 자신을 참조할때 사용하는 this는 생성자를 호출하기 위한
 * this()의 형태로 사용가능 -- 메서드 아님!!
 * this() 생성자 호출은 생성자에서만 가능
 * 생성자의 맨 첫줄에서만 사용가능
 * 
*/

//
//class MutalLisk {
//	private int x, y, attack, upgrade, speed;
//	private String name;
//	
//	public MutalLisk() {
//		this(0, 0, 9, 1, 5, "redMutalLisk");
//	}
//	
//	public MutalLisk(int x, int y) {
//		this(x, y, 9, 1, 5, "blueMutalLisk");
//	}
//	public MutalLisk(int x, int y, int attack, int upgrade, int speed, String name) {
//		super();
//		this.x = x;
//		this.y = y;
//		this.attack = attack;
//		this.upgrade = upgrade;
//		this.speed = speed;
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "name=" + name + "[x=" + x + ", y=" + y + ", attack=" + attack + ", upgrade=" + upgrade + ", speed=" + speed + "]";
//	}
//	
//	
//}







public class ConstructorEx2 {
	
//	public ConstructorEx2() {
//		System.out.println("default Constructor"); //4
//	}
//	
//	public ConstructorEx2(String str) {
//		this();	// 3
//		System.out.println(str + " constructor"); // 5 
//	}
//	public ConstructorEx2(String str, int n) {
//		this(str); 	// 2
//		System.out.println(str + n + " constructor"); // 6
//	}
	
	
//	public ConstructorEx2() {
//		this("가나다", 10); // 2			6
//		System.out.println("default Constructor"); 
//	}
//	
//	public ConstructorEx2(String str) {
//		System.out.println(str + " constructor");  	// 4
//	}
//	public ConstructorEx2(String str, int n) {
//		this(str); 	//	3			5
//		System.out.println(str + n + " constructor"); 
//	}
	
	public ConstructorEx2() {
		System.out.println("default Constructor");  //4
	}
	
	public ConstructorEx2(int num) {
		this("가나다", num);	// 2
		System.out.println(num + " constructor"); //6 	
		
	}
	public ConstructorEx2(String str, int num) {
		this(); 	// 3
		System.out.println(str + num + " constructor"); //5 
	}
	
	
	
	public static void main(String[] args) {
		new ConstructorEx2(10); // 1		7
		
//		MutalLisk mutal01 = new MutalLisk();
//		MutalLisk mutal02 = new MutalLisk(10, 10);
//		MutalLisk mutal03 = new MutalLisk(20, 20, 100, 15, 10, "heroMutalLisk");
//		
//		System.out.println(mutal01.toString());
//		System.out.println(mutal02.toString());
//		System.out.println(mutal03.toString());
//		
	}

}
