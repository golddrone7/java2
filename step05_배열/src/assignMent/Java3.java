package assignMent;
/*
[문제3] 급여명세서를 작성하시오
조건1) 기본급이 1,500,000원,시간수당이 55,000원,세금은 기본급의 10%
조건2) 실수령액 = 기본급 + 시간수당 - 세금

--출력--     
실수령액 : 1405000원

*/



public class Java3 {
	public static void main(String[] args) {
		
		int baseSalary = 1500000; // 기본급여
		int hourlyRate = 55000; // 시간수당
		double tax = baseSalary * 0.1;
		int realWages = baseSalary + hourlyRate - (int)tax; // 실수령액
		
		System.out.println("실수령액 : "+realWages+"원");
	}
}
