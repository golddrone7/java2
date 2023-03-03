package JavaStudy;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
	
	@PrintAnnotation(value="!", number=5)
	public void method4() {
		System.out.println("실행 내용4");
	}
}
