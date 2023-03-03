package assignment7;

/*
(1)클래스명 : Salary
  -name:String (이름)
  -salary:int  (연봉)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary에 대입
  +viewInfomation():void     ==> 메서드에서 이름과 연봉을 출력

*/
public class Salary {
	private String name;
	private int salary;
	
	public Salary() {
		
	}
	
	public Salary(String name ,int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInfomation() {
		System.out.println("이름  : " + name);
		System.out.println("연봉 : " + salary);
	}
	

}
