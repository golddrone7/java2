package study;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		String[] strArray = {"a", "p", "p", "l", "e"};
		Arrays.stream(strArray).forEach(s -> System.out.println(s));
	}

}
