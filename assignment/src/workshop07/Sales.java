package workshop07;

public class Sales extends Employee implements Bonus {
	public Sales() {
		// TODO Auto-generated constructor stub
	}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public void incentive(int pay) {
		super.setSalary(getSalary() + (int)(pay*1.2)); 
	}
	@Override
	public double tax() {
		return super.getSalary() *0.13;
	}
}
