package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		// System.out 모니터(표준출력)
		// System.in 키보드(표준입력)+ 콘솔
		BufferedReader br = new BufferedReader(isr);
		String name;
		char gender;
		int age;
		String temp;
		double weight;
		float tall = -1;
		do {
			System.out.print("이름을 입력하세요 : ");
			name = br.readLine();
			if(name.length() == 0) {
				System.out.println("공백을 입력하지마세요.");
				name = "이름없음";
				continue;
			}
			if(!('A'<=name.charAt(0)&&name.charAt(0) < 'z'))
				System.out.println("이름 첫 글자의 값의 유효범위는 A~z입니다.");
			
		}while(!('A'<=name.charAt(0)&&name.charAt(0) < 'z') );
		
		do {
			System.out.print("성별을 입력하세요 : ");
			temp = br.readLine();
			if(temp.length() == 0) {
				System.out.println("공백을 입력하지마세요.");
				gender = 'n';
				continue;
			}
			gender = temp.charAt(0);
				
			if(!(gender == '남' || gender == '여'))
				System.out.println("\"남\" 또는 \"여\" 를 입력하세요");
		} while(!(gender == '남' || gender == '여'));
		//charAt(index) : index로 주어진 값에 해당하는 문자를 리턴
		//index는 0번 부터 시작, 가장 큰 수는 문자열의 길이 -1(문자열.length-1)
		//index가 없으면 공백 출력
		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(br.readLine()); // "23" --> 23 기본 자료형 int
		do {
			System.out.print("체중을 입력하세요 : ");
			weight = Double.parseDouble(br.readLine()); // 기본 자료형 double
			if(weight<=0)
				System.out.println("유효한 범위의 체중을 입력하세요");
		}while(weight<=0);
		
		while(tall <= 0) {
			System.out.print("신장을 입력하세요 : ");
			tall = Float.parseFloat(br.readLine());
			if(tall <= 0)
				System.out.println("유효한 신장은 양의 실수입니다.");
		}
		System.out.println("이름은 " +name+ "입니다");
		System.out.println("성별은 " + gender +"자 입니다");
		System.out.println("나이는 " + age +"세 입니다");
		System.out.println("체중은 " + weight + "kg 입니다");
		System.out.println("신장은 "+tall+"cm입니다.");
	}
}

