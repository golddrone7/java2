package assignment5_230106;

import java.util.Scanner;

/*
	[문제30] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

(1) main()에서 배열선언후 코드를 완성하시오
      int []month={31,28,31,30,31,30,31,31,30,31,30,31};
 (2)콘솔에서 달(month)을 입력받아 해당하는 일(day)를 출력하시오

[실행결과]
원하는 month을 입력하시오 : 3
3월은 31일입니다.



*/
public class Problem30 {

	public static void main(String[] args) {
		int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
		int selectMonth;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 month을 입력하시오 : ");
		selectMonth = sc.nextInt();
		sc.close();
		System.out.println(selectMonth+"월은 "+month[selectMonth-1]+"일 입니다.");
	}
}
