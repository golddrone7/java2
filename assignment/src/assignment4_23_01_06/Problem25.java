package assignment4_23_01_06;

/*
[문제 25] argument에서 데이터를 받아 프로그램을 구현하시오
(1) main() 메서드
              :
     System.out.println("더하기: "+sum(x,y));
     System.out.println("빼기: "+sub(x,y));
     System.out.println("곱하기: "+multi(x,y));
     System.out.printf("나누기: %.2f\n", divi(x,y));

(2)입.출력 화면
$ java Test25  5 3 

더하기 : 8
빼  기 : 2
곱하기 : 15  
나누기 : 1.67


*/
public class Problem25 {

	public static double sum(double x, double y) {
		return x+y;
	}
	
	public static double sub(double x, double y) {
		return x-y;
	}
	public static double multi(double x, double y) {
		return x*y;
	}
	public static double divi(double x, double y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		 double x = Double.parseDouble(args[0]);
		 double y = Double.parseDouble(args[1]);
		
		 System.out.println("더하기: "+sum(x,y));
	     System.out.println("빼기: "+sub(x,y));
	     System.out.println("곱하기: "+multi(x,y));
	     System.out.printf("나누기: %.2f\n", divi(x,y));
	}

}
