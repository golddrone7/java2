package step01_기초;
/*
	문제. 4개의 변수를 만들어서 다음과 같이 완성하세요
			(이름, 국어, 영어, 수학)
	이름 : 둘리
	국어 : 95
	영어 : 85
	수학 : 73
	총점 : 253
*/

public class Test2 {
	public static void main(String[] args) {
		String name = "둘리";
		int kor = 95;
		int eng = 85;
		int math = 73;
		//int avg = kor+eng+math;
		
		System.out.println("이름 : "+name+"\n"
				+ "국어 : "+kor+"\n"
				+ "영어 : "+eng+"\n"
				+ "수학 : "+math+"\n"
				+ "총점 : "+(kor+eng+math));
	}
}
