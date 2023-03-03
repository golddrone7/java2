package db5;

import java.util.List;

public class StudentView {

	public void insertStudent(String name) {
		if (name != null)
			System.out.println(name + "님이 추가 되었습니다");
		else
			System.out.println("점수 입력 오류 다시 입력하세요!");
	}

	public void getStudent(StudentEntity student) {
		if (student != null)
			System.out.println("이름 : " + student.getName() + "\t총점 : " + student.getTot() + "\t평균 : "
					+ String.format("%.2f", student.getAvg()));
		else
			System.out.println("데이터가 없습니다.");
	}

	public void getStudentList(List<StudentEntity> list) {
		if (list != null) {
			for (StudentEntity student : list) {
				System.out.println("이름 : " + student.getName() + "\t국어 : " + student.getKor() + "\t영어 : "
						+ student.getEng() + "\t수학 : " + student.getMat() + "\t총점 : " + student.getTot() + "\t평균 : "
						+ String.format("%.2f", student.getAvg()));
			}
		} else
			System.out.println("데이터가 없습니다");

	}

	public void error2() {
		System.out.println("점수 입력 오류 다시 입력하세요!");
	}

}
