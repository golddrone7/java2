package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 크기가 5개인 정수형 배열을 만들고 배열에 데이터를 입력을 받아서 
 * 출력하고 최대값, 최소값을 구하세요

	ar[0]의 값을 입력 : 25
	ar[1]의 값을 입력 : -34
	ar[2]의 값을 입력 : 25
	ar[3]의 값을 입력 : 25
	ar[4]의 값을 입력 : 25
	
	25 -34 ..
	최대값 : 25
	최소값 : -34
	
*/
public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print("ar["+i+"]의 값을 입력 : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
//		int j=1;
//		while(j<arr.length) {
//			if(max < arr[j])
//				max = arr[j];
//			if(min > arr[j])
//				min = arr[j];
//			j++;
//		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
