package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제1] 다음 조건에 맞게 프로그램을 완성하세요

1. score1.txt파일을 읽어서 화면에 출력하세요
2. 이름, 국어, 영어, 수학점수를 읽어서 총점과 평균을 구하세요
3. 파일명 : ScoreTest.java

4. 출력화면
이름 : 홍길동 총점 : 221 평균 : 73.66
이름 : 이순신 총점 : 216 평균 : 72.00
*/
public class ScoreTest1test {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader is = new FileReader("src\\test1\\score1.txt"); 
		BufferedReader br = new BufferedReader(is);
		
		
		String str;
		String[] strr = new String[10];
		int sum;
		int count = 0;
		
		while((str=br.readLine()) != null) {
//			if(str.getClass())
//			System.out.println(str);
			strr[count++] = str;
			
		}
		br.close();
		is.close();
		
		System.out.print("이름 : " + strr[0]);
		sum = Integer.parseInt(strr[1]) + Integer.parseInt(strr[2]) + Integer.parseInt(strr[3]);
		System.out.print(" 총점 : " + sum);
		System.out.printf(" 평균 : %.2f\n", sum/3.0);
		System.out.print("이름 : " + strr[4]);
		sum = Integer.parseInt(strr[5]) + Integer.parseInt(strr[6]) + Integer.parseInt(strr[7]);
		System.out.print(" 총점 : " + sum);
		System.out.printf(" 평균 : %.2f\n", sum/3.0);
		
	}
}
