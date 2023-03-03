package workshop07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Secretary("Hilery", 1, "seceretary", 800));
		map.put(2, new Sales("Clinten", 2, "sales", 1200));
		System.out.println("name\t\tdepartment\t\tsalary");
		System.out.println("-----------------------------");
		List<Integer> list = new ArrayList<>(map.keySet());
		for(int i : list) {
			Employee e = map.get(i);
			System.out.println(e.getName() +"\t\t" + e.getDepartment() +"\t\t" + e.getSalary());
		}
		System.out.println();
		System.out.println("name\t\tdepartment\t\tsalary\t\ttax");
		System.out.println("------------------------------------");
		for(int i : list) {
			Employee e = map.get(i);
			if(e instanceof Secretary) {
				((Secretary)e).incentive(100);
			}
			if(e instanceof Sales) {
				((Sales)e).incentive(100);
			}
			System.out.println(e.getName() +"\t\t" + e.getDepartment() +"\t\t" + e.getSalary() + "\t\t" + e.tax());
		}
	}
}
