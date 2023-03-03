package assignment12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Test56 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Hashtable<String, PhoneBook> ht = new Hashtable<>();
		ht.put("홍길동", new PhoneBook("123-4567", "서울"));
		ht.put("이몽룡", new PhoneBook("345-3345", "대구"));
		ht.put("임꺽정", new PhoneBook("123-7890", "부산"));
		System.out.print("찾는 사람을 입력하시오 : ");
		String name = br.readLine();
		if(ht.containsKey(name))
			System.out.println(ht.get(name).toString());
		else
			System.out.println("찾는 사람이 없다");
	}
}
