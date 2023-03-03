package family;


//객체 배열 사용하여 객체 생성 후 출력
public class MainEx	 {
	public static void main(String[] args) {
		//Family[] fm  = new Family[3];
		Family[] fm = new Family[] {new Father("홍길동"), new Mother("키리나"), new Son("홍준표")};
//		fm[0] = new Father("홍길동");
//		System.out.println(fm[0].toString());
//		fm[1] = new Mother("카리나");
//		System.out.println(fm[1].toString());
//		fm[2] = new Son("홍준표");
//		System.out.println(fm[2].toString());
		for(Family a : fm) {
			System.out.println(a.toString());
			// toString 생략가능, 각 클래스에 toString메서드가 있기 때문에
			System.out.println();
		}
	}
}
