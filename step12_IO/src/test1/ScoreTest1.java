package test1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
4. 출력화면
이름 : 홍길동 총점 : 221 평균 : 73.66
이름 : 이순신 총점 : 216 평균 : 72.00

*/
public class ScoreTest1 {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new FileReader("src\\test1\\score1.txt");
		BufferedReader br = new BufferedReader(is);
		int[] num = new int[3];
		int sum = 0;
		String name;

		while ((name = br.readLine()) != null) {
			for (int i = 0; i < 3; i++) {
				num[i] = Integer.parseInt(br.readLine());
				sum += num[i];
			}
			System.out.print("이름 : " + name);
			System.out.print(" 총점 : " + sum);
			System.out.printf(" 평균 : %.2f\n", sum / 3.0);
			sum = 0;
		}
		br.close();
	}
}
