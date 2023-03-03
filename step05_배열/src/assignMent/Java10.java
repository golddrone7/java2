package assignMent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
        조건) 성별 : M 이면 "남자", 나머지 "여자" 
             (삼항연산자 이용)

Input name: 들국화
Input gender: F
Input age:  25
Input tall: 173.3 

--결과--
이름 : 들국화
성별 : 여자 
나이 : 25세
신장 : 173.3cm  
*/

	
public class Java10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input name: ");
		String name = br.readLine();
		System.out.print("Input gender: ");
		char gender = br.readLine().charAt(0);
		System.out.print("Input age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Input tall: ");
		double tall = Double.parseDouble(br.readLine());
		
		
		
		System.out.println("이름 : " + name);
		System.out.printf("성별 : %s\n", (gender == 'M') ? "남자" : "여자" );
		System.out.println("나이 : " + age);
		System.out.printf("신장 : %.1f\n", tall);
	}

}
