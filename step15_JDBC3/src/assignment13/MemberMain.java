package assignment13;

import java.util.Scanner;


public class MemberMain {
	Scanner sc = null;
	
	public MemberMain() {
		sc = new Scanner(System.in);
	}
	public void menu() {
		String name, phone;
		MemberController mc = new MemberController();
		
		while (true) {
			System.out.println("1.추가  2.삭제  3.전체보기  4.찾기  5.종료");
			System.out.print("선택(1~5) : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: // 추가
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("전화 : ");
				phone = sc.next();
				MemberEntity mem = new MemberEntity();
				mem.setName(name);
				mem.setPhone(phone);
				mc.insertMember(mem);
				break;
			case 2: // 삭제
				System.out.print("삭제할사람 : ");
				name = sc.next();
				mc.deleteMember(name);
				break;
			case 3: // 전체보기
				mc.getMemberList();
				break;
			case 4: // 찾기
				System.out.print("찾는사람 : ");
				name = sc.next();
				mc.getMember(name);
				break;
			case 5: // 종료
				System.out.println("*** 작업끝 ***");
				System.exit(0);
				
			}
		}
	}
	
	public static void main(String[] args) {
		new MemberMain().menu();
	}
}
