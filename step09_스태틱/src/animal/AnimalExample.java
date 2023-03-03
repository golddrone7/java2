package animal;

import java.util.Scanner;


public class AnimalExample {
	// 정적 바인딩 : 실행이전에 값이 정해짐 (C, C++ default)
	// 동적 바인딩 : 실행이후에 값이 정해짐 (Java default), 자바에선 static을 명시해줘야 정적 바인딩이 됨.
	public static void main(String[] args) {
		int select;
		Scanner sc = new Scanner(System.in);
		Animal ani = new Animal();

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
				ani.walk();
				ani.voice();
				break;
			case 2:
				ani = new Cat();
				ani.walk();
				ani.voice();
				break;
			case 3:
				ani = new Duck();
				ani.walk();
				ani.voice();
				break;
			case 4:
				ani = new Fish();
				ani.walk();
				ani.voice();
				break;
			case 5:
				System.out.println("****** 종료합니다 ******");
				sc.close();
				System.exit(0);
			}
		}
	}
}
