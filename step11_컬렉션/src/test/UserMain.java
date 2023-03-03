package test;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw;
		System.out.print("ID를 입력하세요 : ");
		id=sc.next();
		System.out.print("PW를 입력하세요 : ");
		pw=sc.next();
		
//		System.out.println(id + " " + pw); 값이 잘 저장되었는지 체크
		
		UserProc up = new UserProc();	// DAO
		User entity = up.getLoginUser(id, pw); // id, pw가 존재하면 로그인 처리
		
		if(entity!=null) {  // 정상적으로 데이터가 넘어옴
			System.out.println(entity.getName() + "님이 입장하셨습니다");
			System.out.println("현재 포인트는 "+entity.getPoint()+"점입니다");
			
			BookProc book = new BookProc();
			ArrayList<Book> list = book.getList();
			System.out.println();
			System.out.println("[[ Book의 정보보기 ]]");
			
			for(Book b : list) {
				System.out.println("책이름 : " + b.getTitle()+"\t책저자 : " + b.getAuthor() +"\t페이지 : "+ b.getPage());
			}
		} else {
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 iD입니다");
		}
		
		
		/* 
			ID를 입력하세요 : pororo
			PW를 입력하세요 : 1234
			
			뽀로로님이 입장하셨습니다.
			현재 포인트는 89.97점입니다
			
			[[ Book의 정보보기 ]]
			책이름 : java		책저자 : 둘리	페이지 : 300
			책이름 : jsp		책저자 : 도우너	페이지 : 200
			책이름 : oracle	책저자 : 마이콜	페이지 : 100
			----------------------------------------
			ID를 입력하세요 : pororo
			PW를 입력하세요 : 1111
			
			ID 또는 PW가 틀리거나 존재하지 않는 iD입니다
		*/
	}
}
