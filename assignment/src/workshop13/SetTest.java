package workshop13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		
		for(int i=0; i<args[0].length(); i++) {
			set.add(args[0].substring(i, i+1));
		}
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
