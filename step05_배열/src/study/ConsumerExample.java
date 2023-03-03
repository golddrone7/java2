package study;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> con = t-> System.out.println(t + "8");
		con.accept("java");
		
		BiConsumer<String, Integer> bCon = (t, u) -> System.out.println(t + u);
		bCon.accept("java", 8);
		
		DoubleConsumer dCon = d -> System.out.println("Java"+ d);
		dCon.accept(8.0);
		
		ObjIntConsumer<String> oCon = (t, i) -> System.out.println(t + i);
		oCon.accept("Java", 8);
		
		IntConsumer consumer = n -> System.out.println(n * 100);
		consumer.accept(10);
		consumer.accept(50);
		Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());

        List<String> list = Arrays.asList("apple", "kiwi", "orange");

        list.forEach(consumer2);
	}
}
