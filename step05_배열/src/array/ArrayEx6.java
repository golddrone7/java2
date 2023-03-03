package array;

// 2차원 배열

public class ArrayEx6 {
	public static void main(String[] args) {
		
		int [][] num = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][]num2  = new int[5][];
		
		for(int i=0; i<num2.length; i++) {
			int ran = (int)(Math.random() * 5);
			num2[i] = new int[ran];
		}

		for(int i=0; i<num2.length; i++) {
			for (int j=0; j<num2[i].length; j++) {
				num2[i][j] = i+j;
			}
		}
		
		for(int i=0; i<num2.length; i++) {
			for(int j=0; j<num2[i].length; j++) {
				System.out.print(num2[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
