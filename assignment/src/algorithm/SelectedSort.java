package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectedSort {

	public static void main(String[] args) throws IOException {
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
		for(int i=0; i<n; i++) {
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(num[idx] > num[j]) idx = j;
			}
			int tmp = num[i];
			num[i] = num[idx];
			num[idx] = tmp;
		}
		System.out.println("- 선택 정렬 알고리즘 -");
		for(int i : num) {
			System.out.print(i + " ");
		}
	
	
	}
	
	
}
