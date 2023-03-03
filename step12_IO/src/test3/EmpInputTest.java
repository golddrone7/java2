package test3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
==========================================
2) emp.txt파일을 읽어서 출력하시오
파일명 : EmpInputTest.java
처리조건 : StringTokenizer을 이용해서 데이타를 파싱하여
            아래와 같이출력하시오

[출력결과]
이름 : 강호동   부서 : 개발부   급여 150000
이름 : 이순신   부서 : 영업부   급여 250000
*/
public class EmpInputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/test3/emp.txt"));
		String str, name, department, salary;
		while ((str = br.readLine())!= null) {
			StringTokenizer st = new StringTokenizer(str, "\t");
//			if(st.hasMoreElements() == false)
//				break;
			
			
			while (st.hasMoreElements()) {
				name = st.nextToken();
				department = st.nextToken();
				salary = st.nextToken();
				System.out.println("이름 : " + name + "\t부서 : " + department + "\t급여 " + salary);
			}
		}
	}
}
