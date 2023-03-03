package test2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;

public class SourceTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is = new FileReader("src\\test2\\score2.txt");
		BufferedReader br = new BufferedReader(is);
		OutputStream out = new FileOutputStream("src\\test2\\dest.txt");
		
		PrintStream ps = new PrintStream(out);
		
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
			ps.printf("이름 : %s 총점 : %d 평균 : %.2f\n", name, sum, (sum/3.0));
			ps.flush();
			sum = 0;
		}
		is.close();
		br.close();
		out.close();
		ps.close();
		System.out.println("저장되었습니다.");
	}
}
