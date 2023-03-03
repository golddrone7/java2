package array;

//배열 : 동일한 자료형의 연속된 기억공간
//List 구조, 배열의 구조
//배열은 1차원적으로 연속적인 구조
// ㅁㅁㅁㅁㅁㅁㅁ
/*
	ㅁㅁㅁㅁㅁㅁㅁ
	ㅁㅁㅁㅁㅁㅁㅁ
	ㅁㅁㅁㅁㅁㅁㅁ
	ㅁㅁㅁㅁㅁㅁㅁ
	ㅁㅁㅁㅁㅁㅁㅁ
*/

// 4차원대신 2차원에서 요소에 2차원을 담아서 DB에 사용

// 1차원 배열

public class ArrayEx1 {
	public static void main(String[] args) {
//		자료형[] 변수명={값1, 값2, ..., 값n}
//		int[] num = {100,200,300,400,500};  
		
		int[] num=new int[5]; // 5개의 기억공간을 할당
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		num[4]=500;
		
//		for(int i=1; i<=num.length; i++) {
//			num[i-1] = 100*i;
//		}
		
		//향상된 for문
		for(int i : num) {
			System.out.println(i);
		}
//		
		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//		System.out.println(num.length);
		//역순 출력
//		for(int i=num.length; i>0; i--) {
//			System.out.println(num[i-1]);
//		}
		
		
		
		
		
		
		
	}

}
