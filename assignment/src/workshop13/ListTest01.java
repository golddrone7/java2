package workshop13;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// argument로 정수를 받는다.
		int n = Integer.parseInt(args[0]);	
		// MakeList 객체 생성
		MakeList make = new MakeList();
		// 무작위의 번호 발생 후 저장
		make.makeArrayList(n);		
		ArrayList<Integer> list = null;
		
		// for문을 이용하여 ArrayList의 정보 출력하고 평균을 출력 한다.
		make.getAverage();
		list = make.getList();
		// 평균 출력
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("평균 : " + String.format("%.1f", make.getAverage()));
	}

}
