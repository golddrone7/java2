package methodex;

//call by reference : 참조에 의한 호출

public class MethodEx7 {

	public static void intArr(int[] a) {
		for(int i=0; i<a.length; i++)
			a[i] = i + 10;
	}
	
	public static void view1(String str) {
		System.out.println(str);
		str="hello";
	}
	
	// 기본형은 값을 읽기만 가능
	// 참조형은 값을 읽고 쓰기 가능
	
	public static void view2(int[] num) {
		for(int i=0; i<num.length; i++) 
			System.out.print(num[i] + " ");
		System.out.println();
		System.out.println(num);
		num[0] = 100;
	}
	
	
	public static void main(String[] args) {
		String str= "happy";
		view1(str);
		
		System.out.println(str);
		
		int[] num = {10,20,30,40,50};
		int a = 3;
		view2(num);
		System.out.println(num); // 데이터베이스 참조형으로 활용
		
	
		
		for(int i : num) {
			System.out.print(i + ", ");
		}
		
		
		
		
//		int[] num = {1,2,3,4,5,6,7,8,9,10};
//		intArr(num);
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
	}

}
