package assignment13;

import java.util.ArrayList;

public class StudentController {
	StudentDao dao;
	StudentView view;
	
	public StudentController() {
		dao = new StudentDao();
		view = new StudentView();
	}
	
	public void getStudentList() {
		ArrayList<Student> list = dao.getStudentList();
		view.getStudentList(list);
	}
	
	public void getStudent(String name) {
		Student entity = dao.getStudent(name);
		view.getStudent(entity);
	}
	public String insertStudent(Student ob) {
		
		if(!(0<=ob.getKor() && ob.getKor()<=100
				&& 0<=ob.getEng() && ob.getEng()<=100
				 && 0<=ob.getMat() && ob.getMat()<=100))
			return "입력값에 오류가 있습니다";
		int n = dao.insertStudent(ob);
		view.insertStudent(n, ob.getName());
		return "";
	}
	
	public void deleteStudent(String name) {
		int n = dao.deleteStudent(name);
		view.deleteStudent(n, name);
	}
}
