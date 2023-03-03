package step02_연산자;

public class OperatorEx {
	public static void main(String[] args) {
	
		//변수의 초기화		
		String a=null; // String a="";
		int b=0;
		double c=0;
		float d=0.0f;
//		char e=0; // 묵시적으로 비어있는 값
		char e='\0';
		
		boolean toggle = null == "" ? true : false;
		System.out.println(toggle);
		int weapon = 500;
		boolean enter = false;		
		enter = (300<=weapon && weapon<600?true:false);
		System.out.println(enter); // true				
		//삼항연산자	(조건식)?(true 값):(false 값)
//		char code = '남';
//		// 조건식 ?
//		String gender;
//		// 적절한 때에 괄호를 사용해주면 가독성을 높여줌
//		gender = (code=='남' || code=='M'?"man":"woman");
//		//System.out.println(gender = (code=='남' || code=='M'?"man":"woman"));
//		System.out.println(gender);
//		
//		//변수=조건식?조건식이참일때리턴값:조건식이거짓일때리턴값;
//		//삼항연산자는 자주 사용하므로 익숙해지기
//		int level = 60;
//		String enter;
//		enter = (!(50<=level && level<70) ? "입장 가능":"입장 불가능");
//		System.out.println(enter);
//		
		//단항연산자
//		int x=7;
//		// x=x+1					화면	메모리	
//		System.out.println(x++); // 7 	 8	// 후위연산자 : 계산이 나중에 되어짐(반복문에 많이 사용)
//		System.out.println(++x); // 9	 9	// 전위연산자 : 계산하고 출력(메모리 값이랑 화면 값이 일치)
//		System.out.println(x);	 // 9	 9
//		System.out.println(--x); // 8	 8
//		System.out.println(x--); // 8	 7
//		System.out.println(x);	 // 7
//		
//		//대입연산자
//		int k =7;
//		k+=2; // k=k+2;   9
//		k*=6; // k=k*6;   54
//		k-=4; // 50
//		k%=7; // 1
//		System.out.println(String.format("k = %d", k));

//		//산술연산자
//		System.out.println(5%3); // 나머지 연산
//		System.out.println(5/3); // 몫 연산
//		//관계연산자
//		int a = 5;
//		System.out.println(a==5); // a는 5와 같은가? true
//		System.out.println(a>=5); // a는 5와 크거나 같은가? true
//		System.out.println(a!=5); // a는 5와 같지 않은가? false
//		//논리연산자 and, or, not
//		//0만 거짓, 이외는 참 but 관례적으로 1로 표현
//		String str="hello";
//		System.out.println(str=="hello" || str=="Hello"); // true
//		System.out.println(str=="hello" && str=="Hello"); // false
//		int score = 57;
////		System.out.println(score>=70 && score<90); // false
//		System.out.println(score>=70 || score<90); // true
//		
//		boolean ck = true;
//		System.out.println(!ck); // ! 논리부정
//		
//		boolean sw = score>=70 && score<90;
//		System.out.println(sw);
//		
//		int key = !(score>=70 && score<90) ? 100:57;
//		System.out.println(key);
//		
	}
}
