package object;

import java.util.Scanner;

/* 클래스명 : MemberPhone
 * -name:String
 * -phone:String
 * +input():void		<== 이름과 전화번호 입력
 * +output():void		<== 출력
*/
public class MemberPhone {
	private String name;
	private String phone;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();	// 줄단위 입력
		System.out.print("전화번호를 입력하세요 : ");
		phone = sc.nextLine();
		sc.close(); // Scanner는 느린 대신 편리  읽어올 데이터가 적을 때 사용, 버퍼 영역이 작음
					// BufferedReader는 빠름	 읽어올 데이터가 많을 때 사용, 버퍼 영역이 많음
					
					
	}
	public void output() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는 " + phone);
	}
}
