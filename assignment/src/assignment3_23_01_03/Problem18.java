package assignment3_23_01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제18] 콘솔로 입력받아 구구단을 구하시오 (단일 for문)
이때, 5단을 입력하면 5단,6단 출력하시오
        4단을 입력하면 4단,5단 출력하시오
단을 입력하시오: 5
5 * 1= 5                6 * 1= 6
5 * 2= 10              6 * 2= 12 
5 * 3= 15              6 * 3= 18
5 * 4= 20              6 * 4= 24
5 * 5= 25              6 * 5= 30 
5 * 6= 30              6 * 6= 36
5 * 7= 35              6 * 7= 42
5 * 8= 40              6 * 8= 48
5 * 9= 45              6 * 9= 54
*/
public class Problem18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int dan;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단을 입력하시오: ");
		dan = Integer.parseInt(br.readLine());
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d= %d\t", dan, i, dan*i);
			System.out.printf("%d * %d= %d\n", dan+1, i, (dan+1)*i);
		}
		
		
		
		
	}

}
