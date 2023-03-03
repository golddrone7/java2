package db5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int select, kor, eng, mat;
		String name;
		StudentBiz biz = new StudentBiz();
		while(true) {
			System.out.println("1.추가  2.검색  3.전체보기 4.종료");
			System.out.print("선택(1-4) : ");
			select = Integer.parseInt(br.readLine());
			switch(select) {
			case 1:
				System.out.print("이름을 입력 : ");
				name = br.readLine();
				System.out.print("국어점수 입력 : ");
				kor = Integer.parseInt(br.readLine());
				System.out.print("영어점수 입력 : ");
				eng = Integer.parseInt(br.readLine());
				System.out.print("수학점수 입력 : ");
				mat = Integer.parseInt(br.readLine());
				biz.insertStudent(new StudentEntity(name, kor, eng, mat));
				break;
			case 2:
				System.out.print("이름을 입력하시오 : ");
				name = br.readLine();
				biz.getStudent(name);
				break;
			case 3:
				biz.getStudentList();
				break;
			case 4:
				System.out.println("** 고생 하셨습니다 **");
				System.exit(0);
			}
		}
	}
}
