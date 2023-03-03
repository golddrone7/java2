package assignment4_23_01_06;

/*
	[문제 24]다중for문을 이용해서 모양을 만드시오
*****
****
***
**
*

1
21
321
4321
54321


*/
public class Problem24 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
}
