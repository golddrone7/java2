package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("배열의 길이를 입력");
		n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		System.out.println("정렬하고자 하는 숫자 입력 ");
		StringTokenizer tk = new StringTokenizer(br.readLine());
		for(int i=0; i < n ; i++) {		
			num[i] = Integer.parseInt(tk.nextToken());
		}
		
		for(int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		System.out.println("- 버블 정렬 알고리즘 - ");
		for(int i : num) {
			System.out.print(i + " ");
		}
		
	}

}
