package workshop13;

import java.util.ArrayList;
import java.util.HashSet;

public class ListHashSet {

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		// ArrayList에 size만큼의 개수 만큼 랜덤한 숫자를 넣는다.
		for(int i=0; i<size; i++){
			list.add((int)(Math.random()*10)+1);
			System.out.print(list.get(i) + " ");
		}	
		System.out.println();
		// ArrayList에 정보를 HashSet에 넣는다.
		for(int i=0; i<size; i++){
			set.add(list.get(i));
		}
		System.out.println(set.toString());
	}

}
