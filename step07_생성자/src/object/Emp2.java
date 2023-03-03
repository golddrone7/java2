package object;

public class Emp2 {
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return ""+name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다";
	}
}
