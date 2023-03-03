package assignment3_23_01_03;
/*
[문제14] 50개의 난수를 만들어서 다음과 같이 출력하시오
조건1) 0 - 100 사이의 수 일것
조건2) 1줄에 6개씩 표시하시오  

--출력--
12      72      74      0       20      89
84      83      53      0       95      53
68      55      89      6       20      68
17      9       75      56      17      85
62      33      7       34      85      28
28      55      95      31      69      22
30      92      1       16      88      80
64      55      71      12      29      72
20      41
합=2420
*/



public class Problem14 {

	public static void main(String[] args) {
		int sum=0;
		int rand;
		for(int i=1; i<=50; i++) {
			rand = (int)(Math.random() * 101); // Math.random() 0~1사이 double값 리턴이 됌
			sum+=rand;
			System.out.print(rand+"\t");
			if(i%6==0)
				System.out.println();
		}
		System.out.println();
		System.out.println("합="+sum);
	}
}
