package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test22 {

	
	public static void main(String[] args) {
		String my_string = "hi12392";
		ArrayList<Integer> list = new ArrayList<>();
		int[] num;
		for(int i=0; i<my_string.length(); i++) {
			if('0'<=my_string.charAt(i) && my_string.charAt(i)<='9') {
				list.add((int)my_string.charAt(i) - 48);
			}
		}
		
		num = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			num[i] = list.get(i);
		}
		
		
		Arrays.sort(num);
		for(int i : num) {
			System.out.print(i);
		}
	}
}
