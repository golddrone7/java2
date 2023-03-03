package step03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 이름 : 진달래
   성별 : 여
   나이 : 23
   
   이름은 진달래입니다
   성별은 여자입니다
   나이는 23세입니다
   1
*/ 
public class InputTest3 {
	public static void main(String[] args) throws IOException {
		// 1. 동작의 절차를 나눠서 변수를 추가하는 방식
		// 2. 변수를 전부 선언하는 방식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;	
		System.out.print("이름 : "); // name
		name = br.readLine(); // Ctrl + 1  > 자동완성2
		System.out.print("성별 : "); // gender
		gender = br.readLine().trim().charAt(0);
		System.out.println("나이 : "); // age
		age = Integer.parseInt(br.readLine());
		// br.readLine() 사용 이유
		// age = br.read(); 문자를 숫자로 표현해서 올바른 값을 출력하지 못함.
		System.out.println("이름은 "+name+", 성별은 "+gender+", 나이는 "+age+"살 ");
		//|여자
		//| 여자 공백처리 .trim();		
		}
}
