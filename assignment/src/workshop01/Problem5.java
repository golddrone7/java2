package workshop01;

/*
	[ 문제 5 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 화씨를 섭씨로 변경하는 프로그램을 작성 하시오.
	C(celcius): 섭씨, F(fahrenheit): 화씨
	공식: C = 5/9 * (F-32)
*/
public class Problem5 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius =  ((float)5/9 * (fahrenheit - 32));
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
}
