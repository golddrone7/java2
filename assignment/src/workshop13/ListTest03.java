package workshop13;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		for(int i=1; i<=10; i++) {
			list1.add((int)(Math.random()*10));
			list2.add((int)(Math.random()*10));
		}
		
		// 첫 번째 ArrayList의 1번쨰부터 10번째까지의 숫자를 두 번째 ArrayList의
		// 1번쨰부터 10번째까지의 숫자로 나누는 연산 처리를 진행 한다.
		
		for(int i=0; i<10; i++) {
			if(list2.get(i) == 0) {
				System.out.println(list1.get(i) + "/" + list2.get(i) + " 분모가0입니다");
				continue;
			}
			System.out.println(list1.get(i) + "/" + list2.get(i) + " " + (list1.get(i)/ list2.get(i)));
		}
		
		// 분모가 0일 경우 Exception 처리를 한다, “분모가 0입니다”라는 메시지를 출력한다
	}

}
