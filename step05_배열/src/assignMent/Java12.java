package assignMent;

/*
[문제12]성적처리프로그램
중간고사,기말고사,레포트,출석점수를 Argument로 입력받아서 계산하시오

조건1) (중간+기말)/2       ---> 60%
  과제                   ---> 20%
  출석                   ---> 20%

조건2)   90이상 'A'학점     (3)A,B학점  ---->"excellent"
   80이상 'B'학점         C,D학점  ---->"good"
   70이상 'C'학점         F학점    ---->"poor"
   60이상 'D'학점        (switch문이용) 
 
   나머지 'F'학점
   (if~else if문이용)



$ java Test12  90 89 99 100  

[출력화면]
중간고사 : 90
기말고사 : 89
과제점수 : 99
출석점수: 100

성적=93.20      <---소수이하 둘째자리까지
학점=A              System.out.printf("성적 : %.2f", avg);
평가=excellent
*/
public class Java12 {
	public static void main(String[] args) {
		
		
		int midtermExam = Integer.parseInt(args[0]);
		int finalExam = Integer.parseInt(args[1]);
		int assignment =Integer.parseInt(args[2]);
		int attendance = Integer.parseInt(args[3]);
		
		double score = ((double)(midtermExam+finalExam)/2*0.6) + 
				((double)assignment*0.2) + 
				((double)attendance*0.2);
		char grade;
		String evaluation;
		System.out.println(score);
		
		System.out.println("중간고사 : " + midtermExam);
	
		System.out.println("기말고사 : " + finalExam);
		System.out.println("과제점수 : " + assignment);
		System.out.println("출석점수: " + attendance);
		System.out.println();
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		switch(grade) {
		case 'A':
		case 'B':
			evaluation = "excellent";
			break;
		case 'C':
		case 'D':
			evaluation = "good";
			break;
		default:
			evaluation = "poor";
		
		}
		
		
		System.out.printf("성적=%.2f\n", score);
		System.out.println("학점=" + grade);
		System.out.println("평가=" + evaluation);
	}

}
