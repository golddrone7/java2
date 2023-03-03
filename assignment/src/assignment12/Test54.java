package assignment12;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test54 {

	public static void main(String[] args) {
		Map<String, Integer> ht = new HashMap<>();
		DecimalFormat df = new DecimalFormat("###,###,###원");
		ht.put("콩쥐팥쥐", 15000);
		ht.put("백설공주", 10000);
		ht.put("보물섬", 18000);
		
		Iterator<String> keys = ht.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + "의 책가격="+df.format(ht.get(key)));
		}
	}

}
