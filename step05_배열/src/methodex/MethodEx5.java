package methodex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;






public class MethodEx5 {
	
	public static void show1() {
		System.out.println("안녕하세요");
	}
	
	
	//타입 : A
	//코드 : 25
	public static void show2(char a, int b) {	// call by value(값이 복사)
		System.out.println("타입 : " + a);
		System.out.println("코드 : " + b);
	}
	
	public static String show3() {
		return "hello";
	}
	
	public static int[]	inputArray(int[] arr) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력하세요 : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		return arr;
	}
	// 84.33이 나오도록 평균을 구해서 리턴해주세요.
	public static float show4(int a, int b, int c) {
		return (float)(a+b+c)/3;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		show1(); // 안녕하세요 출력
		show2('A', 25);
		String s =show3();
		System.out.println("리턴값 : " + s);
		
		float k = show4(95, 85, 73);
		System.out.printf("리턴값 : %.2f\n", k);
			
		int arr[] = new int[6];
		arr = inputArray(arr);
		double max = arr[0];
		double min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.printf("max의 값은 : %.1f\n"
				+ "min의 값은 : %.1f\n", max, min);
	}
}
