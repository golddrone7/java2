package constructor;
// 홍길동의 점수는 253점이며 평균은 84.33점이고 학점 B입니다

import java.io.IOException;

public class ConstructorEx6 {
	public static void main(String[] args) throws IOException {
//		Student stu = new Student();
//		stu.setName("홍길동");
//		stu.setEng(100);
//		stu.setKor(100);
//		stu.setMath(53);
//		System.out.println(stu.toString());

		Student kim = new Student();
//		Student kim = new Student("민들레", 95, 85, 73);
		System.out.println(kim.toString());
		System.out.println("이름은 : " + kim.getName());
		System.out.println("국어 점수 : " + kim.getKor()+ "점");
		System.out.println("영어 점수 : " + kim.getEng()+ "점");
		System.out.println("수학 점수 : " + kim.getMath() + "점");
		System.out.println("합계는 : " + kim.getTotal() + "점");
//		System.out.printf("평균은 : %.2f점\n", kim.getAvg());
		System.out.println("평균은 : " + String.format("%.2f", kim.getAvg()));
		System.out.println("학점은 : " + kim.getGrade());
//		
	}

}
