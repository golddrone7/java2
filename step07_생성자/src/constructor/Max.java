package constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max {
	public int a, b;
	
	public Max() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("두 수를 입력하세요 : ");
		StringTokenizer tk = new StringTokenizer(br.readLine());
		a = Integer.parseInt(tk.nextToken());
		b = Integer.parseInt(tk.nextToken());
	}
	
	
	public int maxValue() {
		return Math.max(a, b);
	}
	
	
	public int minValue() {
		return Math.min(a, b);
	}
	public void show() {
		System.out.println("큰수 : " + maxValue());
		System.out.println("작은수 : " + minValue());
	}
}
