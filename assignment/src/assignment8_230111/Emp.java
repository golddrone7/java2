package assignment8_230111;

import java.text.DecimalFormat;

//[문제44] 오버라이드(override)를 이용하여 다음 프로그램을 작성하시오
//(1)클래스명: Emp
//   name:String                   ==> 초깃값 : 홍길동
//   salary:int                        ==> 초깃값 : 32000000
//   +getDisplay():String        ==> 이름과 연봉출력
public class Emp {
	String name = "홍길동";
	int salary =  32000000;
	
	public String getDisplay() {
		return "이름 : " + name +"\n연봉 : " 
				+ new DecimalFormat("00,000,000").format(salary) + "원\n";
	}
	
	
}
