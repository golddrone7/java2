package object;

public class Emp1 {
	private String name;
	private String dept;
	private int salary;

	public Emp1() {		
		this("No Name", "No Dept", 0);
	}
	
	public Emp1(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
//	public void setEmp(String name, String dept, int salary) {
//		this.name = name;
//		this.dept = dept;
//		this.salary = salary;
//	}
	
	public void printEmp() {
		System.out.println("이름은 " + name);
		System.out.println("부서는 " + dept);
		System.out.println("급여는 " + salary);
	}
}
