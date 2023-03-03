package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float d = Float.parseFloat(br.readLine());
		System.out.printf("%.2f", d);
	}

}
