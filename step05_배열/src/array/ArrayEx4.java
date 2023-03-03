package array;
/* args로 세 수를 입력 받아서 최대값, 최소값을 출력
 * $ java ArrayEx4 10 15 23
 * 
 * 최대값 : 23
 * 최소값 : 10
*/

public class ArrayEx4 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
//		arr[0] = Integer.parseInt(args[0]);
//		arr[1] = Integer.parseInt(args[1]);
//		arr[2] = Integer.parseInt(args[2]);
		
		for(int i=0; i<args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<args.length; i++) {
			if(max<arr[i])
				max =arr[i];
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println();
		
		
		
	}

}
