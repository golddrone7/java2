package ifex;

public class ifEx1 {
	public static void main(String[] args) {	

		int score=85;
		char grade='\n'; // 초기화 생략 불가


		if(score>90 && score<100)	grade = 'A'; // 정해진 값 제외하고 나머지 부분에서 검사가 되지 않기 때문에
		if(score>80 && score<90)	grade = 'B'; // 초기화가 되지 않는다.
		if(score>70 && score<80)	grade = 'C';
		if(score>60 && score<70)	grade = 'D';
		if(score>0 && score<60)		grade = 'F';
		
		System.out.println("점수는 "+score+"점이며 학점은 "+grade+"입니다.");	
		
////	if~else if~else--------------------------
//		int score = 95;
//		char grade;
//		
//		if(score>=90) grade = 'A';
//		else if(score>=80) grade = 'B';
//		else if(score>=70) grade = 'C';
//		else if(score>=60) grade = 'D';
//		else grade = 'F';
////		System.out.printf("최종 점수는은 %d점이고 학점은 %c입니다.\n", score,grade);
//		System.out.println("최종 점수는 "+score+"점이고 학점은 "+grade+"입니다.");
//		
		
		
//		if~else문----------------------------
//		int score = 57;
//		
//		if(score>=60) {
//			System.out.println("합격");
//			System.out.println("점수는 " + score+"점입니다");
//		} else {
//			System.out.println("불합격");
//			System.out.println("점수는 " + score + "점이고 다음기회에...");
//		}
//		
		
		
//		if(score>60) {
//			System.out.println("합격");
//		} else if(score>50){
//			System.out.println("보충");
//		} else if(socre>40){
//			System.out.println("미달");
//		} else
//			System.out.println("재수강");
//		
		
//		단순 if문		
//		String str="hello";
//		//{}브레이스
//		
//		if(str=="hello") { // if(expression)
//			System.out.print("헬로우"); // 문장1 statement
//			System.out.println(" Java"); // 문장2
//		}
//		
//		if(str=="hello") 
//			System.out.print("헬로우 ");	// indent 들여쓰기
//		System.out.println("Java--");
	}
}
