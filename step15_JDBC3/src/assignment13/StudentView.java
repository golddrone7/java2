package assignment13;

import java.util.ArrayList;

public class StudentView {
	public void insertStudent(int n, String name) {
		if(n>0 && name != null) {
			System.out.println(name+"을 추가했습니다.");
		} else
			System.out.println("데이터 추가에 실패했습니다.");

	}

	public void deleteStudent(int n, String name) {
		if(n>0 && name !=null) {
			System.out.println("삭제되었습니다.");
		} else
			System.out.println("데이터 삭제에 실패했습니다.");
	}

	public void getStudentList(ArrayList<Student> list) {
		if (list.size() != 0) {
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t결과\t순위");
			System.out.println("------------------------------------------------------------------------------");
			for (Student entity : list) {
				System.out.print(entity.getMid() + "\t");
				System.out.print(entity.getName() + "\t");
				System.out.print(entity.getKor() + "\t");
				System.out.print(entity.getEng() + "\t");
				System.out.print(entity.getMat() + "\t");
				System.out.print(entity.getTot() + "\t");
				System.out.print(String.format("%.2f", entity.getAvg()) + "\t");
				System.out.print(entity.getGrade() + "\t");
				System.out.print(entity.getResult() + "\t");
				System.out.println(entity.getRank());
			}
		} else
			System.out.println("조회할 데이터가 없습니다.");
	}

	public void getStudent(Student ob) {
		if(ob==null) {
			System.out.println("찾는 사람이 없습니다.");
		} else {
			System.out.println(ob.toString());
		}
	}

}
