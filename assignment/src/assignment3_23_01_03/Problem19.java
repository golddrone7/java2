package assignment3_23_01_03;
/*
[문제 19] 다중for문을 이용해서 다음과 같이 출력하시오
Korea 0  0
Korea 0  1
Korea 0  2


System.out.println("Korea "+i+"  "+j+""

Korea 1  0
Korea 1  1
Korea 1  2

Korea 2  0
Korea 2  1
Korea 2  2
*/

public class Problem19 {

	public static void main(String[] args) {
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				System.out.println("Korea " + i + " " + j);
			}
			System.out.println();
		}
	}

}
