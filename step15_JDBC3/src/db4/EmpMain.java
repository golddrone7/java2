package db4;

import java.io.IOException;
import java.util.Scanner;

public class EmpMain {
	Scanner sc = null;
	EmpBiz biz = null;
	EmpEntity entity = null;
	public EmpMain() {
		sc = new Scanner(System.in);
		biz = new EmpBiz();
		entity = new EmpEntity();
	}
	
	public void menu()  {
		int select = 0;
		String name = null, phone = null, addr = null;
		while (true) {
			System.out.println("1.전체 2. 추가 3. 수정 4. 삭제 5. 검색 6. 종료");
			System.out.print("선택하세요(1-6) : ");
			select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1: // 전체
				biz.addressList();
				break;
			case 2: // 추가
				System.out.print("이름입력 : ");
				entity.setName(sc.nextLine());
				System.out.print("전화입력 : ");
				entity.setPhone(sc.nextLine());
				System.out.print("주소입력 : ");
				entity.setAddr(sc.nextLine());
				
				biz.addressInsert(entity);
				
				break;
			case 3: // 수정 preparedstatement, 다 만들면 statement
				/*
				 *  1.전체 2. 추가 3. 수정 4. 삭제 5. 검색 6. 종료
				 *  선택하세요(1-6) : 3
				 *  수정할 사람 이름 : aaa
				 *  바꿀 전화 번호 : 2580-2580
				 *  바꿀 주소 입력 : 거문도
				*/
				System.out.print("수정할 사람 이름 : ");
				name = sc.nextLine();
				if(biz.addressSearch(name)) {
					System.out.print("바꿀 전화 번호 : ");
					phone = sc.nextLine();
					System.out.print("바꿀 주소 입력 : ");
					addr = sc.nextLine();
					
					biz.addressUpdate(name, phone, addr);
				} 
				break;
			case 4: // 삭제
				System.out.print("삭제할 사람 이름 : ");
				name = sc.nextLine();
				if(biz.addressSearch(name)) {
					biz.addressDelete(name);
				}
				break;
			case 5: // 검색
				System.out.print("찾는사람 : ");
				name=sc.nextLine();
				biz.addressSearch(name);
				break;
			case 6: // 종료
				sc.close();
				System.out.println("***** 종료합니다 *****");
				System.exit(0);
			default:
				System.out.println("잘못 입력");
			}
		}
	}
	public static void main(String[] args)  {
		new EmpMain().menu();
	}
	
}
