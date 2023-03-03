package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 
 수는 1,000보다 작거나 같은 자연수이다.
 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

출력
총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

제한
1 ≤ N ≤ 100,000
1 ≤ M ≤ 100,000
1 ≤ i ≤ j ≤ N

입력					출력
5 3
5 4 3 2 1			12
1 3					9
2 4					1
5 5
*/

public class PrefixSum {
	static int[] array;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken());
		int M = Integer.parseInt(tk.nextToken());
		int a;
		int b;
		array = new int[N+1];
		tk = new StringTokenizer(br.readLine());
		for(int i = 1; i<N+1; i++) {
			array[i] = array[i-1] + Integer.parseInt(tk.nextToken());
		}
		for(int i = 0; i<M; i++) {
			tk = new StringTokenizer(br.readLine());
			a = Integer.parseInt(tk.nextToken());
			b = Integer.parseInt(tk.nextToken());
			System.out.println(array[b] - array[a-1]);
		}
	}
}
