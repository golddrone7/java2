package object;

import java.util.Scanner;

public class ObjectEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char exit;
		int base, top, height;
		do {
			//base, top, height 입력 받기
			System.out.println("***** 사다리꼴의 넓이 구하기 *****");
			System.out.print("밑변의 값을 입력 : ");
			base = sc.nextInt();
			System.out.print("윗변의 값을 입력 : ");
			top = sc.nextInt();
			System.out.print("높이의 값을 입력 : ");
			height = sc.nextInt();
//			Trapezoid클래스로 객체를 만들어서 넓이 구하기
//			객체생성--> 값 대입 --> 결과출력
//			넓이 : 
			Trapezoid tr = new Trapezoid();
			tr.setTrapezoid(base, top, height);
			System.out.println("넓이 : " + tr.toString());
			
			System.out.print("한번더 실행할까요?(y/Y) : ");
						
			exit = sc.next().charAt(0);
		} while(exit=='y' || exit=='Y');
		System.out.println("수고하셨습니다.");
		sc.close();
	}
}
