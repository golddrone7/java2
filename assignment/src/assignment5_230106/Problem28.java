package assignment5_230106;

import java.util.Scanner;

/*
[문제28] 다음 프로그램을 작성하시오
(1)Argument를 통해 숫자를 입력받은후 입력숫자만큼 정수형배열을 만든다
(2)콘솔에서 각각 배열에 데이타를 입력 받는다
(3)입력받은 데이타의 평균을  구한다 

[실행결과]
$ java Test22  5

score[0]를 입력하시오 : 34.5
score[1]를 입력하시오  : 90.4
     .
     .
score[4]를 입력하시오  : 100.0

평균 : 56.45               <--- 소수점 아래 둘째자리까지 구하시오

*/
public class Problem28 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		
		double[] score = new double[num];
		for(int i=0; i<score.length; i++) {
			System.out.print("score["+i+"]를 입력하시오 : ");
			score[i] = sc.nextDouble();
			sum += score[i];
		}
		sc.close();
		System.out.printf("평균 : %.2f", sum/score.length);
	}
}
