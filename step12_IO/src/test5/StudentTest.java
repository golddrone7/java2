package test5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = new FileReader("src/test5/student.dat");
		FileWriter fw = new FileWriter("src/test5/backup.dat", true);
		PrintWriter ffw = new PrintWriter(fw);
		Scanner sfi = new Scanner(fr);
		int count=0;
		String name;
		int k, e, m;
		int korSum=0, mathSum=0, engSum=0;
		StringTokenizer st = null;
		List<Student> stu = new ArrayList<>();
		String str;
		while(sfi.hasNextLine() == true) {
			str = sfi.nextLine(); // 민들레-국어:80/영어:90/수학:100
			st = new StringTokenizer(str,"-:/");
			name = st.nextToken();
			st.nextToken();
			k = Integer.parseInt(st.nextToken());
			st.nextToken();
			e = Integer.parseInt(st.nextToken());
			st.nextToken();
			m = Integer.parseInt(st.nextToken());
			stu.add(new Student(name, k, e, m));
			count++;
		}
		System.out.println("총학생수=" + count);
		for(Student s : stu) {
			engSum+=s.getEng();
			mathSum+=s.getMat();
			korSum+=s.getKor();
		}
		System.out.println("국어 총합 = " + korSum + " 국어 평균 = " + korSum/count);
		System.out.println("영어 총합 = " + engSum + " 영어 평균 = " + engSum/count);
		System.out.println("수학 총합 = " + mathSum + " 수학 평균 = " + mathSum/count);
		
		ffw.println("총학생수=" + count);
		ffw.println("국어 총합 = " + korSum + " 국어 평균 = " + korSum/count);
		ffw.println("영어 총합 = " + engSum + " 영어 평균 = " + engSum/count);
		ffw.println("수학 총합 = " + mathSum + " 수학 평균 = " + mathSum/count);
		ffw.flush();
		
		ffw.close();
	}

}
