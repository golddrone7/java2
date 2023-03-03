package whileex;
/* switch 와 while을 이용한 메뉴 프로그램
 * 
 * 1. 사각형 2. 삼각형 3. 원 4. 종료
 * 선택하세요 : 1
 * 사각형이 선택되었습니다.
 * 
 * 1. 사각형 2. 삼각형 3. 원 4. 종료
 * 선택하세요 : 4
 * ***** 프로그램을 종료합니다 *****
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int select = 0;
		// while(select!=4) {
		while (true) {
			System.out.print("1. 사각형 2. 삼각형 3. 원 4. 종료\n선택하세요 : ");
			try {
				select = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				select = 0;
			}
			System.out.println(select);
			switch (select) {
			case 1:
				System.out.println("사각형이 선택되었습니다.");
				break;
			case 2:
				System.out.println("삼각형이 선택되었습니다.");
				break;
			case 3:
				System.out.println("원이 선택되었습니다.");
				break;
			case 4:
				System.out.println("***** 프로그램을 종료합니다 *****");
				System.exit(0); // 정상 종료 0 : 정상종료. 0이외 : 비정상 종료(에러코드 404, 500, 503...)
				break;
			default:
				System.out.println("잘못된 선택입니다.");
				break;
			}
		}
	}
}
