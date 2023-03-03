package employee;

/* 사원번호 : 101			<=== developer
 * 사원이름 : Scott
 * 내선번호 : 5687
 * 기본급여 : 2500000
 * 보너스+수당 : 450000
 * 지급금액 : 2950000원
 * 
 * 사원번호 : 201			<=== engineer
 * 사원이름 : Tiger
 * 내선번호 : 1234
 * 기본급여 : 1500000
 * 보너스+수당 : 225000
 * 지급금액 : 1725000원
*/
public class EmpMain {
	public static void main(String[] args) {
		Emp devep = new Developer(101,"Scott","5687");
		devep.setSalary(2500000);
		devep.setBonus(350000);
		System.out.println(devep.toString());
		System.out.println();
		Emp engin = new Engineer(201,"Tiger","1234");
		engin.setSalary(1500000);
		engin.setBonus(75000);
		System.out.println(engin.toString());
		
	}
}
