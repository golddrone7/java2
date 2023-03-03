package constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름은 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		math = Integer.parseInt(br.readLine());
		
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		
		return ""+name+"의 점수는 "+getTotal()+"점이며 평균은 "+String.format("%.2f", getAvg())+"점이고 학점 "+getGrade()+"입니다";
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return getTotal()/3.0;
	}
	
	public char getGrade() {
		switch((int)(getAvg()/10)) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default : return 'F';
		}
	}
}
