package workshop02;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		StudentView sv = new StudentView();
		Student stu1 = new Student("민들래", 15, 170, 55);
		Student stu2 = new Student("진달래", 22, 165, 53);
		Student stu3 = new Student("개나리", 20, 155, 46);
		List<Student> lst = new ArrayList<Student>();
		lst.add(stu1);
		lst.add(stu2);
		lst.add(stu3);
		
		
	
		
		sv.viewStudent(stu1);
		sv.viewStudentList(lst);
	}
}
