package polymorphism;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint;

	void buy(Product p) {
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p + "을 구입했습니다");
	}

	public void toString2() {
		System.out.println("잔액은 " + money);
	}

}

public class Test2 {
	
	
	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer computer = new Computer();
		Audio audio = new Audio();

		b.buy(tv); // Product p
		b.toString2();
		b.buy(new Audio());
		b.toString2();
		b.buy(new Computer());
		b.toString2();
		
		int i=0; 
		
		while(i<10) {
			if(i%2==0)
				System.out.println();
				System.out.println("Hello");
				
			
			
		}
		
	}

}