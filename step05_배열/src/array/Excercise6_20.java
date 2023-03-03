package array;
import java.util.Arrays;
public class Excercise6_20 {

	public static int max(int[] arr) {
		int maxA = -999999;
		if (arr != null) {
			if (arr.length != 0) {
				maxA = arr[0];
				for (int i = 1; i < arr.length; i++) {
					if (maxA < arr[i])
						maxA = arr[i];
				}
			}
		}
		return maxA;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		//System.out.println(java.util.Arrays.toString(data));
		System.out.println(Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));

	}

}
