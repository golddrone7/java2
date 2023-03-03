package test3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
[문제3] 데이타를 입력받아 파일에 기록하시오

1) 값을 입력받아 파일로 출력하는 프로그램
파일명 : EmpOutputTest.java
처리조건 : 데이타들 사이에 \t를 추가하여 저장하시오
           ex) name+"\t"+dept+"\t"+salary+"\n"


입력을 종료하시려면 ctrl+z를 하시오
이름을 입력하시오 : 강호동
부서를 입력하시오 : 개발부
급여를 입력하시오 : 1500000
계속 입력하려면 Enter키를 누르시오

이름을 입력하시오 : 이순신
부서를 입력하시오 : 영업부
급여를 입력하시오 : 2500000
계속 입력하려면 Enter키를 누르시오
ctrl+z

emp.txt파일이 저장 되었습니다
--------------------------------------------------------
emp.txt파일
강호동    개발부    1500000
이순신    영업부    2500000

==========================================
2) emp.txt파일을 읽어서 출력하시오
파일명 : EmpInputTest.java
처리조건 : StringTokenizer을 이용해서 데이타를 파싱하여
            아래와 같이출력하시오

[출력결과]
이름 : 강호동   부서 : 개발부   급여 150000
이름 : 이순신   부서 : 영업부   급여 250000


*/


public class EmpOutputTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		OutputStream out = null;
//		out = new FileOutputStream("src/test3/emp.txt");
		//PrintWriter pt = new PrintWriter(out);
//		PrintWriter pt = new PrintWriter("src/test3/emp.txt");
		PrintStream pt = new PrintStream(new FileOutputStream("src/test3/emp.txt"));
		BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
		String name, department, salary;
		
		System.out.println("문자열을 입력하고 마지막 줄에서 ctrl+z로 종료하세요.");
		do { // -1 : EOF(End Of File)
			System.out.print("이름을 입력하시오 : ");
			name = cr.readLine();
			System.out.print("부서를 입력하시오 : ");
			department = cr.readLine();
			System.out.print("급여를 입력하시오 : ");
			salary = cr.readLine();
			System.out.println("계속 입력하려면 Enter키를 누르시오");
			pt.printf("%s\t%s\t%s\n", name, department, salary);
			pt.flush();
		}while(cr.readLine()!=null);
		System.out.println("emp.txt파일이 저장 되었습니다");
		
		
	}
}
