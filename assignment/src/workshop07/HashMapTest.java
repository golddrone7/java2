package workshop07;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		double sum=0.0;
		for(int i=1; i<=10; i++){
		// HashMap에 1~100까지의 정수를 랜덤하게 10개 저장한다.
			map.put(i, (int)(Math.random()*100)+1);
		}
		for(int i=1; i<=10; i++){
		// HashMap 데이터를 화면에 출력한다.
			System.out.print(map.get(i) + " ");
		}
		for(int i=1; i<=10; i++){
		// HashMap 데이터의 합계를 계산한다.
			sum+=map.get(i);
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/10));
		// 합계와 평균을 화면에 출력한다.
	}
}
