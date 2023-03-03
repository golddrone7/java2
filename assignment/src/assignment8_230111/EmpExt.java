package assignment8_230111;

/*
(2)클래스명: EmpExt
   department:String        ==> 초깃값 : "홍보부";
   +getDisplay():String    ==> 부서출력

*/
public class EmpExt extends Emp {
	String department = "홍보부";
	
	@Override
	public String getDisplay() {
		return super.getDisplay() + "부서 : " + department;
	}
}
