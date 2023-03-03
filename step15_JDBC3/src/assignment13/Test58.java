package assignment13;

import java.util.Scanner;

public class Test58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape sh = null;
		while (true) {
			System.out.println("1.사각형\t2.원\t3.종료");
			System.out.print("select(1-3) : ");
			int m = sc.nextInt();

			switch (m) {
			case 1:
				sh=new Rectangle();
				break;
			case 2:
				sh=new Circle();
				break;
			case 3:
				System.out.println("시스템이 종료됩니다.");
				System.exit(0);
			default:
				System.out.println("잘못 입력 다시 입력해주세요");
			}
			sh.onDraw();
			sh.onDelete();
		}
	}
}
