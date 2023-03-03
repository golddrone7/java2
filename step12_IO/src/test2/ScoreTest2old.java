package test2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

/*
1. score2.txt파일을 읽어서 결과물을 dest.txt로 저장하시오
2. 파일명:ScoreTest2.java
3. dest.txt
    이름 : 홍길동 총점 : 221 평균 : 73.67
    이름 : 이순신 총점 : 216 평균 : 72.00
    이름 : 뽀로로 총점 : 253 평균 : 84.33
*/
public class ScoreTest2old {

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new FileReader("src\\test2\\score2.txt");
		BufferedReader br = new BufferedReader(is);
		OutputStream out = new FileOutputStream("src\\test2\\dest.txt");
		PrintStream ps = new PrintStream(out);
		String str;
		String[] strr = new String[150];
		int sum;
		int count = 0;
		
		while ((str = br.readLine()) != null) {
//			if(str.getClass())
		//	System.out.println(str);
			strr[count++] = str;

		}
		br.close();
		is.close();

		for(int i=0; i<count; i+=4) {
			System.out.print("이름 : " + strr[i]);
			sum = Integer.parseInt(strr[i+1]) + Integer.parseInt(strr[i+2]) + Integer.parseInt(strr[i+3]);
			System.out.print(" 총점 : " + sum);
			System.out.printf(" 평균 : %.2f\n", sum / 3.0);
			ps.printf("이름 : %s 총점 : %d 평균 : %.2f\n", strr[i], sum, (sum/3.0));
			ps.flush();
		}
		is.close();
		br.close();
		out.close();
		ps.close();
		System.out.println("저장되었습니다.");
		

	}

}
