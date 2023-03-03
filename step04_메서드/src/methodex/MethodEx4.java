package methodex;

public class MethodEx4 {

	public static int total(int k, int e, int m) {
		return k+e+m;
	}
	public static double avg(int i) {
		return (double)i/3;
	}
	
	public static char grade(double avg) {
		switch((int)avg/10) {
		case 10:
		case 9: return 'A';
		case 8:	return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default : return 'F';
		}
	}
	
	public static String result(char pass) {	// 형색매개변수 변수 = 상수, 상수 = 상수(틀린표현)
												// 		char a = 'B' 	'B' = 'B' 
		for(int i=0; i<10; i++) {
			System.out.println(pass);
		}
		if(pass=='F')
			return "불합격";
		else
			return "합격";
//		switch(pass) {
//		case 'F' : return "불합격";
//		default : return "합격"; 
//		}
	}
	
	
	public static void main(String[] args) {
		int k=95, e=85, m=73;
		System.out.println("총점 : " + total(k, e, m)+"점"); //total(95, 85, 73)
		System.out.printf("평균 : %.1f 점입니다. \n", avg(total(k,e,m))); // avg(253)
		System.out.println("학점 : " + grade(avg(total(k,e,m)))); // grade(84.33333)
		System.out.println("결과 : " + result(grade(avg(total(k,e,m))))); //result('B')
		// F학점인 경우 "불합격", 나머지는"합격"
	}
}
