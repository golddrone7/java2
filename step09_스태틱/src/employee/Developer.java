package employee;
/*	Emp를 상속받은 후
-salary:long
-bonus:long
+Developer()
+Developer(eno:int, ename:String, phone:String)
+toString() : String

-- 조건:보너스에 100000을 수당으로 더해서 지급

*/

public class Developer extends Emp {
	private long salary;
	private long bonus;
	
	
	@Override
	public String toString() {
		return "사원번호 : "+getEno()+"\n"
				+ "사원이름 : "+getEname()+"\r\n"
				+ "내선번호 : " +getPhone()+"\r\n"
				+ "기본급여 : "+salary+"\r\n"
				+ "보너스+수당 : "+bonus+"\r\n"
				+ "지급금액 : "+(bonus + salary)+"원";
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(int eno, String ename, String phone) {
		super(eno, ename, phone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus= bonus+100000;
	}
	
	
	
	
	

}
