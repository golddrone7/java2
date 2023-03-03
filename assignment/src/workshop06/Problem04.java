package workshop06;

public class Problem04 {

	public static void main(String[] args) {
		double sum = 0, avg;
		if(args.length < 2 || args.length > 2) {
			System.out.println("다시 입력 하세요");
			System.exit(0);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if(a < 1 || 5 <  a || b < 1 || 5 <  b ) {
			System.out.println("숫자를 확인 하세요");
			System.exit(0);
		}
		
		int[][] numArray = new int[a][b];
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				numArray[i][j] = (int)(Math.random() * 5) + 1;
				System.out.print(numArray[i][j] + " ");
				sum += numArray[i][j];
			}
			System.out.println();
		}
		avg = sum /(double)(a*b);
		System.out.println();
		System.out.printf("sum=%.1f\n",sum);
		System.out.printf("avg=%.1f\n",avg);
	}

}
