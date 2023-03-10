package employee;

/* 클래스명 Emp
 * -eno:int
 * -ename:STring
 * -phone:String
 * 
 * +Emp()
 * +Emp(eno:int, ename:String, phone:String)
 * +getter
 * +setSalary(salary:long):void		--- abstract
 * +setBonus(bonus:long):void	--- abstract
 * 

*/
public abstract class Emp {
	private int eno;
	private String ename;
	private String phone;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String ename, String phone) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.phone = phone;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getPhone() {
		return phone;
	}
	public abstract void setSalary(long salary);
	public abstract void setBonus(long bonus);
}
