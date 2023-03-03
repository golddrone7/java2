package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) {
		String str="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("입력하세요 : " );
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(str);
		
	}

}
