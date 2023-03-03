package object;

class Emp3{
	private String name;
	private String dept;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return ""+name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다\n"
				+ "이름 : "+name+"\n"
				+ "부서 : "+dept+"\n"
				+ "급여 : "+salary+"원\n";
		} 
}
public class ObjectTest3 {
	public static void main(String[] args) {
		Emp3 em = new Emp3();
		em.setName("윈터");
		em.setDept("개발부");
		em.setSalary(1520000);
		System.out.println(em.toString());
		System.out.println("이름 : " + em.getName() );
		System.out.println("부서 : " + em.getDept());
		System.out.println("급여 : " + em.getSalary());
	}
}
