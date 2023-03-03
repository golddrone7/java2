package workshop10;

public class Cafe {
	//private Coffee[] coffeeList = new Coffee[3];
	private Coffee[] coffeeList;
	private int index;
	
	public Cafe() {
		index=0;
		coffeeList = new Coffee[3];
	}
	
	public int totalPrice() {
		int totalP = 0;
		for(Coffee a : coffeeList) {
			totalP+=a.getPrice();
		}
		return totalP;
	}
	public void setCoffee(Coffee coffee) {
		if(index>=3) {
			System.out.println("더 이상 저장할 수 없습니다");
			return;
		}
		coffeeList[index++] = coffee;
	}
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
	
}
