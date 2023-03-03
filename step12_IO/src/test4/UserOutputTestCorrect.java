package test4;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class UserOutputTestCorrect {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		double tall;

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/test4/user.txt"));
		do {
			System.out.println("입력을 종료하시려면 Ctrl+z를 하시오");
			System.out.print("Enter your name : ");
			name = br.readLine();
			System.out.print("Enter your age : ");
			age = Integer.parseInt(br.readLine());
			System.out.print("Enter your tall : ");
			tall = Double.parseDouble(br.readLine());

			oos.writeObject(new User(name, age, tall));

			System.out.println("계속 입력하려면 Enter키를 누르시오");
//		} while (System.in.read()!= -1 );
		} while(br.readLine()!= null);
		oos.close();
		br.close();
		System.out.println("user.txt파일이 저장되었습니다.");
	}

}
