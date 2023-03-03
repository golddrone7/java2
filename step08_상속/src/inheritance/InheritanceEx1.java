package inheritance;

class Product{
	private int price;
	String name;
	
	Product(int price){
		this.price = price;
	}
	
	public void show(Product p) {
		System.out.println(p.name+"를 구매했습니다");
	}
	
	public int getPrice() {
		return price;
	}
}


class Computer extends Product{
	String name = "컴퓨터";
	Computer(){
		super(200);
	}
	public void show() {
		System.out.println("컴퓨터를 구매했습니다");
	}
}
class Audio extends Product{
	String name = "오디오";
	Audio(){
		super(100);
	}
	public void show() {
		System.out.println("오디오를 구매했습니다");
	}
}

class Keyboard extends Product{
	String name = "키보드";
	Keyboard(){
		super(50);
	}
	public void show() {
		
		System.out.println("키보드를 구매했습니다");
	}
}


class Buyer{
	private int money;
	
	Buyer(int money){
		this.money = money;
	}
	
	public void buy(Product p) {
		
		money -= p.getPrice();
	}
}



class A {
	int money=100000;
	
	public void EX() {
		System.out.println("현재 잔액은 " + money);
	}
}

class B extends A{
	
	public B() {
		EX();
	}
	
	public void study(int money) {
		this.money -= money;
	}
	
	
}



public class InheritanceEx1 {

	public static void main(String[] args) {
		Buyer con = new Buyer(10000);
		
		
		
	}

}
