package db5;

import java.util.List;

public class StudentBiz {
	
	public void insertStudent(StudentEntity studentEntity) {
		
		String name = null;
		if(!(0<=studentEntity.getKor() && studentEntity.getKor()<=100 && 0<=studentEntity.getEng() && studentEntity.getEng()<=100 && 0<=studentEntity.getMat() && studentEntity.getMat()<=100)) {
			new StudentView().error2();
			return;
		}
		
		if(studentEntity.getName()!=null) {
			StudentDao dao = new StudentDao();
			name = dao.insertStudent(studentEntity);
		}
		new StudentView().insertStudent(name);
		
	}

	public void getStudent(String name) {
		StudentDao dao = new StudentDao();
		StudentEntity student = dao.getStudent(name);
		
		new StudentView().getStudent(student);
	}

	public void getStudentList() {
		StudentDao dao = new StudentDao();
		List<StudentEntity> list = dao.getStudentList();
	
		new StudentView().getStudentList(list);
	}

}
