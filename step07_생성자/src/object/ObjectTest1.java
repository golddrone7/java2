package object;

/* 클래스명 : Emp1
 * 

*/

public class ObjectTest1 {
	public static void main(String[] args) {
		Emp1 employee1 = new Emp1("강남", "기획부서", 3000000);
		Emp1 employee2 = new Emp1();
//		employee1.setEmp("강남", "기획부서", 3000000);
		employee1.printEmp();
		employee2.printEmp();
	}
}
