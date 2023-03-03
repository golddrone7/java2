package methodex;


//call by value : 값에 의한 호출, 매개변수에 값을 전달

public class MethodEx3 {
	
	public static void show1(int a, char b, double c, float d) {
		System.out.println("int a : "+a+"\n"
				+ "char b : "+b+"\n"
				+ "double c : "+c+"\n"
				+ "float d : "+d);
	}
	
	public static int show2(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double show3(int a, int b, int c) {
		return (double)(a+b+c)/3;
		
	}
	// 한번에 여러개의 값을 전달하기 위해 return 여러번 사용 X 1번
	// List로 여러개 값 전달 가능
	public static String show4(int a, int b, int c) {
		double avg = (double)(a+b+c)/3;
		
		if(avg>=60)
			return "합격";
		else
			return "불합격";
	}
	
	public static void main(String[] args) {
		show1(10, 'A', 10.5, 100.3f);
		int sum = show2(95, 85, 73);
		// 여러번 사용할 경우 변수에 담아서 하는 것이 효율적  (총점을 여러번 사용할 경우?) 
		// System.out.println("총점 : " + show2(95, 85, 73))
		// 함수를 여러번 호출하기 때문에 비효율적임. 
		System.out.println("총점 : " + show2(95, 85, 73)); 
		System.out.println("sum : " + sum);
		double avg = show3(95, 85, 73);
		System.out.printf("avg : %.1f\n",avg);
		String pass= show4(95, 85, 73);
		System.out.println("결과는? " + pass);
		
	}

}
