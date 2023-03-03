package switchex;
public class SwitchEx1 {
	public static void main(String[] args) {
		char sw = 'a';
//		if(sw=='e' || sw=='E') {
//			System.out.println("Excellent");
//		} else if(sw=='g' || sw=='G') {
//			System.out.println("Good");
//		} else {
//			System.out.println("Fail");
//		}
		// switch조건 검사는 정수값을 검사
//		switch(sw) {
//		case 'E' : System.out.println("333333");
//		case 'e' :
//			System.out.println("Excellent");
//			break;
//		case 'G' : System.out.println("11111");
//		case 'g' :
//			System.out.println("Good");
//			break;
//		default :
//			System.out.println("Fail");
//			break;
//		}		
		int score=95;
		char grade;
		
		switch(score/10) { //9
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default : 
			grade = 'F';
		
		}
		
		System.out.println("점수는 " + score +"점이고 학점은 " + grade + "입니다");
	}
}
