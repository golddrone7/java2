package workshop13;

import java.util.ArrayList;

public class ListTest02 {
	public static void main(String[] args) {
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		
		ConvertList cl = new ConvertList();
		ArrayList<Integer> list = cl.convertList(array);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
