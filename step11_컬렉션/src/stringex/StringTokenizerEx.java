package stringex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단어 단위로 끊어서 필요한 data를 가지고 오겠다.
public class StringTokenizerEx {

	public static void main(String[] args) throws IOException {
		String str = "1^^23^41^2^^^4124^^^";
		StringTokenizer st = new StringTokenizer(str, "^");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
		
		System.out.println();
//		System.out.println("입력하시오");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		st = new StringTokenizer(br.readLine(), "%!#@$");
//		while(st.hasMoreTokens()) {
//			System.out.print(st.nextToken());
//		}
//		System.out.println();
//		String str2="학교,집,학원,게임방,술집,도서관";
//		String[] value = str2.split(","); // 구분자가 하나인 것
//		for(String s : value) {
//			System.out.println(s);
//		}
		

		String str3="학교,#집$,학원,게임방@,술집,도서관";
		st = new StringTokenizer(str3, ",!@#$%");
		System.out.println("파싱할 문자열의 수 " + st.countTokens()+"개");
		
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
	
		
		
		
//		st = new StringTokenizer(str2, ",");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		
		
	}

}
