package study;
/*
	for(자료형 변수명:배열명){
		문장
	}
*/
class Student{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	Student(){
		this.name = "No name";
		this.age = -1;
	}
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	

}



public class forEach {

	public static void main(String[] args) {
		Student[] stu=new Student[5];
		
		for(int i=0; i< stu.length; i++) {
			stu[i] = new Student("Name"+i, i);
		}
		
		for(Student s : stu) {
			System.out.println("번호는 "+s.getAge()+"번 이름은 "+s.getName()+"입니다." );
			
		}
		
		
		
//		String[] arr = {"1-1","1-2","1-3","1-4","1-5"};
//		for(String s : arr) {
//			System.out.println(s);
//		}
		
		
		
		
	}

}
