package workshop02;

import java.util.List;

public class StudentView {
	public void viewStudent(Student st) {
		
		
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("---------------------");
		System.out.println(st.getName()+"\t"+st.getAge()+"\t"+
						st.getHeight()+"\t"+ st.getWeight());
		System.out.println();
	
	}
	public void viewStudentList(List<Student> lst) {
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("---------------------");
		for(Student st : lst) {
			System.out.println(st.getName()+"\t"+st.getAge()+"\t"+
					st.getHeight()+"\t"+ st.getWeight());
		}
	}
}
