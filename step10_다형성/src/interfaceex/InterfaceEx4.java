package interfaceex;

/*
	클래스와 인터페이스를 이용한 성적 처리
	클래스명 : User
	-name:String
	+User()
	+User(name:String)
	+toString():String // 변수의 상태를 리턴
	
	인터페이스명:Score
	+sol:int(초기값 : 20)	<===배점
	+getScore():int		<==맞은수 * 배점

	인터페이스명:Print()
	+toPrint():String
	
	--출력결과--
	이름 : 뽀로로
	점수 : 60점

*/
public class InterfaceEx4 extends User implements Score, Print{
	
	private int i;
	
	public InterfaceEx4() {
		// TODO Auto-generated constructor stub
	}
	
	public InterfaceEx4(String name, int i) {
		super(name);
		this.i = i;
	}
	
	public static void main(String[] args) {
		
		InterfaceEx4 in = new InterfaceEx4("뽀로로", 3);
		System.out.println(in.toPrint());
	}

	
	@Override
	public String toPrint() {
		return "이름 : " + toString() + "\n점수 : " + (getScore()) + "점" ;
	}

	@Override
	public int getScore() {
		return sol*i;
	}
}
