package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14mmmm {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		char[] ch = new char[10];
		for(int i=0; tk.hasMoreTokens(); i++) {
			ch[i] = tk.nextToken().charAt(0);
		}
		
		System.out.println(ch[1] + " " + ch[0]);
	}

}
