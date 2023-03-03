package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;

	
	public SubTest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		// TODO Auto-generated constructor stub
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return super.toString() + "\n나이는 "+age+"세이고 점수는 "+String.format("%.1f", score)+"점입니다\n";
	}


	public static void main(String[] args) {
		
		//이름은 둘리이고 사는곳은 강동구입니다.
		System.out.println(new SuperTest("둘리", "강동구").toString());
		//이름은 도우너이고 사는곳은 강남구입니다
		//나이는 23세이고 점수는 85.3점입니다
		SubTest sb = new SubTest("도우너", "강남구", 23, 85.3);
		System.out.println(sb.toString());
		
//		int count=0;
//		for(int i = 'A'; i<='Z'; i++)
//			count++;
//		System.out.println(count);
//		char[] eng = new char[count];
	}
}
