package test5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class StudentCorrect{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public StudentCorrect() {
		// TODO Auto-generated constructor stub
	}
	public StudentCorrect(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
}


public class StudentTestCorrect {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/test5/student.dat");
		FileWriter fw = new FileWriter("src/test5/backup.dat"/* , true */);
		Scanner sfi = new Scanner(fr);
		List<Student> list = new ArrayList<>();
		
		while(sfi.hasNextLine() == true) {
			String str = sfi.nextLine();
			StringTokenizer token = new StringTokenizer(str, "/:-");
			
			String name = null;
			int kor=0;
			int eng=0;
			int mat=0;
			
			while(token.hasMoreTokens() == true) {
				name=token.nextToken();
				token.nextToken();
				kor = Integer.parseInt(token.nextToken());
				token.nextToken();
				eng = Integer.parseInt(token.nextToken());
				token.nextToken();
				mat = Integer.parseInt(token.nextToken());
				Student st = new Student(name, kor, eng, mat);
				list.add(st);
				
			}
		}
//		-----------------------------------------------
		//list 각 개체의 국어, 영어, 수학의 총합/평균 구하기
		int sumofKor=0, sumofEng=0, sumofMat=0;
		double avgofKor=0, avgofEng=0, avgofMat=0;
		
		for(int i=0; i<list.size(); i++) {
			Student st = list.get(i);
			sumofKor+=st.getKor();
			sumofEng+=st.getEng();
			sumofMat+=st.getMat();
		}
		avgofKor = sumofKor /list.size();
		avgofEng = sumofEng /list.size();
		avgofMat = sumofMat /list.size();
		
//		-----------------------------------------------
		// backup.dat 파일
		fw.write("===============================\n");
		fw.write("총학생수 = " + list.size() + "명\n");
		fw.write("국어 총합 = "+sumofKor+" 국어 평균 = "+avgofKor+"\n");
		fw.write("영어 총합 = "+sumofEng+" 국어 평균 = "+avgofEng+"\n");
		fw.write("수학 총합 = "+sumofMat+" 국어 평균 = "+avgofMat+"\n");
		fw.write("===============================\n");
		
		sfi.close();
		fr.close();
		
		fw.close();
		System.out.println("backup.dat 파일이 생성되었습니다.");
	}
}
