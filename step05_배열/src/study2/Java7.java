package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제7] BufferedReader를 이용하여 입력받아 두수중 큰수를 출력하시오
(단, 비교연산은 삼항연산자를 이용하시오)
a를 입력하시오 : 5
b를 입력하시오 : 13

큰수 : 13
*/
public class Java7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a를 입력하시오 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b를 입력하시오 : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("큰수 : " + (a > b ? a : b) );
		
		
	}
	
	

}
