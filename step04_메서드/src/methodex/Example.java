package methodex;

class Student{
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	private int id;
	private int pass;
	
	Student(){
		id = 1;
		pass = 2;
	}
	Student(int id, int pass){
		this.id = id;
		this.pass = pass;
	}
	
	
}

public class Example {
	public static Student Good(Student stu) {
		stu.setId(777);
		stu.setPass(7777777);
		return stu;
	}
	
	public static void main(String[] args) {
		Student st = new Student(10, 1111111);
		System.out.println("학생 아이디 : " + st.getId()
						+ "\n학생 번호 : " + st.getPass());
		st = Good(st);
		System.out.println("\n학생 아이디 : " + st.getId()
		+ "\n학생 번호 : " + st.getPass());
		
	}

}
