package assignment4_23_01_06;

/*
	﻿[문제 23] 단일for문과 if문을 이용해서 
             1-10까지의 합을 출력하는 프로그램을 완성하시오

	--출력화면--
	1+2+3+4+5+6+7+8+9+10=55


*/
public class Problem23 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			if(i<10)
				System.out.print(i+"+");
			else
				System.out.print(i+"=");
		}
		System.out.println(sum);
	}

}
