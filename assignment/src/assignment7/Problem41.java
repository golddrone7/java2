package assignment7;

/*
문제 41] 다음 프로그램을 완성하시오
(1)클래스명 : Salary
  -name:String (이름)
  -salary:int  (연봉)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary에 대입
  +viewInfomation():void     ==> 메서드에서 이름과 연봉을 출력

(2)클래스명 : Test41   ==> Salary를 상속받음
  -department:String(부서)
  +Test41()
  +Test41(nameString, salary:int, department:String)
  +viewInfomation():void     ==> 부서 출력

(3)main()함수에서
   Test41  ob = new Test41("홍길동",85000000,"개발부"); 
   //나머지를 완성하시오
           :

[결과화면]
이름 : 홍길동
연봉 : 85000000
부서 : 개발부

*/
public class Problem41 extends Salary {
	
	private String department;
	
	public Problem41() {
		
	}
	public Problem41(String name, int salary, String department) {
			super(name, salary);
			this.department = department;
	}
	
	public void viewInfomation() {
		super.viewInfomation();
		System.out.println("부서 : " + department);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem41  ob = new Problem41("홍길동",85000000,"개발부");
		ob.viewInfomation();
	}

}
