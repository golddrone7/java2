package animal;

import java.util.Scanner;
// 동적 바인딩   1/10만큼 줄여줌  10000라인을 1000라인으로 줄일 수 있음
public class AnimalMain2 {

	public static void main(String[] args) {
		int select;
		Scanner sc = new Scanner(System.in);
		Animal ani = null;

		while(true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit\n");
			System.out.print("번호 입력 : ");
			select = sc.nextInt();
			
			if(!(0<select && select<6)) {
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
				continue;
			}
			
			switch(select) {
			case 1:
				ani = new Dog();
				break;
			case 2:
				ani = new Cat();
				break;
			case 3:
				ani = new Duck();
				break;
			case 4:
				ani = new Fish();
				break;
			case 5:
				System.out.println("****** 종료합니다 ******");
				sc.close();
				System.exit(0);
			}
			
			
			ani.walk();
			ani.voice();
			
		}
		
	}	

}
