package assignment13;

import java.util.Scanner;

public class StudentMain {
	Scanner sc = null;
	StudentController control=null;
	Student entity=null;
	
	public StudentMain() {
		sc = new Scanner(System.in);
		control = new StudentController();
		entity = new Student();
	}
	
	public void menu() {
		String name;
		while(true) {
			System.out.println("1.추가  2.삭제  3.전체보기  4.찾기  5.종료");
			System.out.print("선택(1~5) : ");
			int menu =sc.nextInt();
			
			switch(menu) {
			case 1: // 추가
				entity=new Student();
				System.out.print("이름 : ");
				entity.setName(sc.next());
				System.out.print("국어 : ");
				entity.setKor(sc.nextInt());
				System.out.print("영어 : ");
				entity.setEng(sc.nextInt());
				System.out.print("수학 : ");
				entity.setMat(sc.nextInt());
				System.out.println(control.insertStudent(entity));
				break;
			case 2: // 삭제
				System.out.print("삭제할 사람 : ");
				name = sc.next();
				control.deleteStudent(name);
				break;
			case 3: // 전체보기
				control.getStudentList();
				break;
			case 4: // 찾기
				System.out.print("찾는사람 : ");
				name = sc.next();
				control.getStudent(name);
				break;
			case 5: // 종료
				System.out.println("*** 작업 끝 ***");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new StudentMain().menu();
	}



	
}
