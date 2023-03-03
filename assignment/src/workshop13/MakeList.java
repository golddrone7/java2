package workshop13;

import java.util.ArrayList;

public class MakeList {
	ArrayList<Integer> list;

	
	public MakeList() {
		list = new ArrayList<Integer>();
		}
	
	
		// ArrayList 생성
		public void makeArrayList(int size) {
			list = new ArrayList<Integer>();
			for(int i=0; i<size; i++) {
				list.add((int)(Math.random()*10)+10);
			}
		}
		// ArrayList의 모든 값의 평균을 계산 하여 리턴
		public double getAverage() {
			int sum=0;
			for(int i=0; i<list.size(); i++) {
				sum+=list.get(i);
			}
			return (double)sum/list.size();
		}
		// ArrayList를 리턴
		public ArrayList<Integer> getList() {
			return list;
		}
}
