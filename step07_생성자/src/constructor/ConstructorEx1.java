package constructor;


//class Audio {
//	private int sound = 0;
//	private String name = "No name";
//	
//	Audio(){
//		sound = 0;
//		name = "이름 없음";
//	}
//	
//	Audio(int sound){
//		this.sound = sound;
//	}
//	
//	Audio(String name){
//		this.name = name;
//	}
//	Audio(int sound, String name){
//		this.sound = sound;
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Audio [sound=" + sound + ", name=" + name + "]";
//	}
//	
//	
//	
//}

public class ConstructorEx1 {
	// 생성자 : 객체 생성을 담당
	// 기본 생성자
	
	//생성자 : 객체 생성을 담당 --> 컴퓨터에서 메모리에 사용가능하도록 실체화
	ConstructorEx1(){
		System.out.println("default constructor");
	}
	
	ConstructorEx1(String str) {
		System.out.println(str + " constructor");
	}
	
	ConstructorEx1(String str, int year) {
		System.out.println(str + year + " constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		new ConstructorEx1();	// 객체 생성
		new ConstructorEx1("Hello");
		new ConstructorEx1("GoodDay", 2022);
		
//		Audio radio01 = new Audio(50, "HelloRadio");
//		Audio radio02 = new Audio(100);
//		Audio radio03 = new Audio("ByeRadio");
//		System.out.println(radio01.toString());
//		System.out.println(radio02.toString());
//		System.out.println(radio03.toString());
//		
	}

}
