package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class UserOutputTest {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		double tall;
		PrintWriter pw = new PrintWriter("src/test4/user.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("입력을 종료하시려면 ctrl+z를 하시오");
		do {
			System.out.print("Enter your name :");
			name = br.readLine();
			System.out.print("Enter your age :");
			age = Integer.parseInt(br.readLine());
			System.out.print("Enter your tall :");
			tall = Double.parseDouble(br.readLine());		
			System.out.println("계속 입력하려면 Enter키를 누르시오");
			System.out.println();
			pw.printf("%s|%d|%.1f\n", name, age, tall);
			pw.flush();
		} while(br.readLine() != null);
		System.out.println("user.txt파일이 저장 되었습니다.");
		
		
	}

}
