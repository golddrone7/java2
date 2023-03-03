package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제. 단을 입력 받아서 해당하는 구구단을 출력하세요
	
   단을 입력하세요 : 7
   7 * 1 = 7
   7 * 2 = 14
   7 * 3 = 21
   7 * 4 = 28
   7 * 5 = 35
   7 * 6 = 42
   7 * 7 = 49
   7 * 8 = 56
   7 * 9 = 63
*/
public class WhileEx2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("단을 입력하세요 : ");
		int dan = Integer.parseInt(br.readLine());
		while(i<=9) {
			System.out.println(dan+" * "+i +" = "+dan*i+"");
			i++;
		}
	}
}
