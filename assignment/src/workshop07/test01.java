package workshop07;

public class test01 {

	public static void main(String[] args) {
		int [][] array = {
				{12, 41, 36, 56, 21},
				{82, 10, 12, 61, 45},
				{14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}
				};
		double sum = 0;
		int length=0;
		double avg;
		for(int arr[] : array) {
			for(int a : arr) {
				sum+=a;
			}
			length+=arr.length;
		}
		avg = sum/length;
		System.out.printf("합계 : %.1f\n", sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
