package assignMent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제9] 입력된 문자가 대문자이면 소문자로 출력하고
소문자이명 대문자로 변환하여 출력하시오
그외의 문자이면 "입력데이타오류"라고 표시하시오
(if-else문 이용)   

Input Character: A     
result : a

Input Character: a
result : A

Input Character: *
입력데이터 오류
*/



public class Java9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input Character : ");
		char c = br.readLine().charAt(0);
		
		
		if('A' <= c && c <= 'Z' ) {
			System.out.println((char)(c+32));
		}
		else if('a'<= c && c <= 'z') {
			System.out.println((char)(c-32));
		}
		else
			System.out.println("입력데이터 오류");
			
			
		
	}

}
