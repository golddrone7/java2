package stream;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TriFunction<T, U, V, R>{
	R apply(T t, U u, V v);
}

public class StreamTest {
	public static void main(String[] args) {
		
//		Predicate<String> isEmptyStr = s -> s.length() == 0;
//		String s = "";
//		if(isEmptyStr.test(s))
//			System.out.println("this is an empty String");
//		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
		
		
		
		
		
	}
	

}
