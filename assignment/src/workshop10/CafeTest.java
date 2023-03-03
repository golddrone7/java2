package workshop10;

public class CafeTest {
	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		// Coffee 객체를 3개 생성하고, setCoffee()이용하여 Coffee 배열에 넣는다.
		// Coffee 배열에 있는 객체 정보를 모두 출력 한다 – for 문을 이용 할 것
		// Coffee 가격의 합을 출력 한다
		Coffee ame = new Coffee("Americano", 4000);
		Coffee caf = new Coffee("Caffelatte", 5000);
		Coffee mac = new Coffee("Macchiato", 6000);
		cafe.setCoffee(ame);
		cafe.setCoffee(caf);
		cafe.setCoffee(mac);
		
		for(Coffee a : cafe.getCoffeeList()) {
			System.out.print(a.toString());
		}
		System.out.println();
		System.out.println("Coffee 가격의 합 : " + cafe.totalPrice() + "원");
	}
}
