package emp230111;


//디폴트생성자, 매개변수3개 생성자, getter, setter
//VO(value object), 값 객체, entity, DTO(data transfer object), bean
//데이터를 하나로 묶어서 전송할 목적으로 만든 클래스

/*
	데이터베이스(학교)에 데이터를 하나를 꺼낸다고 생각해보자
	학번	|	이름	|	주소
	1		뽀		강남		(레코드)	학번만 뽑아서 보겠다, 이름만 뽑아서 보겠다.
	2		크		강릉		"금년에 사용한 이름, 20년에 사용했던 이름" => 특정한 정보를 보고 싶다
	
	class Student{			Student ob;
		String name;		객체 ob가 VO라고 표현, (= DTO, entity)
		int num;
		String addr;
		생성자
		get,set
	}
	
*/


public class EmpVO {
	private String ename;
	private String dept;
	private int salary;
	public EmpVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpVO(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	
}
