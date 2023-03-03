package step03_제어문;
/* 문제. 다음과 같이 출력하세요
 * 반지름을 입력하세요 : 5
 * 원의 넓이 : 78.5 <-- 반*반*3.14
 * 원의 둘레 : 31.4 <-- 2*3.14*반
	2
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final double PI = 3.14;
		int radius;
		double circleArea, circleRound;
		
		//입력 처리
		System.out.print("반지름을 입력하세요 : ");
		radius = Integer.parseInt(br.readLine());
		//계산
		circleArea = radius * radius * PI;
		circleRound = 2 * PI * radius;
		//출력
		System.out.printf("원의 넓이 : %.1f\n", circleArea);
		System.out.printf("원의 둘레 : %.1f\n", circleRound);		
	}
}
