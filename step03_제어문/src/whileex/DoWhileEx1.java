package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정수입력 : 0~100 , 정해진 범위 값 벗어날 시 다시 입력하기

public class DoWhileEx1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score;
		do {
			System.out.print("정수입력 : ");
			score = Integer.parseInt(br.readLine());
			if(0<=score && score <=100)
				System.out.println("홍길동님의 점수는 "+score+" 입니다.");
		} while(0<=score && score <=100);
		
	}
}
