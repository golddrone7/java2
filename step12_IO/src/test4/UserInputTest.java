package test4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class UserInputTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/test4/user.txt"));
		StringTokenizer st;
		User user = null;
		String str;
		while((str=br.readLine())!=null){
			st = new StringTokenizer(str,"|");
			user = new User(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
			System.out.println("이름 : " + user.getName() + " 나이 : " + user.getAge() +" 키 "+ user.getTall());
		}
	}
}
