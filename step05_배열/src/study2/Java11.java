package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제11]2개의 숫자와 연산자를 입력하여 계산하시오
조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
       "연산자error"출력하시오

[실행결과]
$ java  Test11   25  36    <-- args입력
연산자를 입력(+,-,*,/) : +  <-- 콘솔입력(BufferedReader를 이용)
25 + 36 = 71

$ java  Test11   25  36
연산자를 입력(+,-,*,/) : /
25 / 36 = xx.xxxxx      

java  SwitchExam   25  36
연산자를 입력(+,-,*,/) : #
연산자 error
*/

public class Java11 {
	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("연산자를 입력(+,-,*,/) : ");
		char oper = br.readLine().charAt(0);
		switch(oper) {
		case '+':
			System.out.println(a+" " + oper + " " + b +" = " + (a+b));
			break;
		case '-':
			System.out.println(a+" " + oper + " " + b +" = " + (a-b));
			break;
		case '*':
			System.out.printf("%d %c %d = %.2f", a, oper, b, ((double)a*b));
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f", a, oper, b, ((double)a/b));
			break;
		default :
			System.out.println("연산자 error");
			
		
		
		
		}
		
		
	}
}
