package object;

/* 클래스명 : Sales
 * -item : String
 * -qty : int
 * -cost : int
 * +getter & setter
 * 
 * +toString():String <== 출력문
 * +getPrice():int <== 수량 *단가 qty * cost
*/
public class ObjectEx5 {
	public static void main(String[] args) {
		Sales customer01 = new Sales();
		customer01.setItem("apple");
		customer01.setCost(1200);
		customer01.setQty(5);	
		//System.out.println("주문 결과 " + customer01.getPrice() +"원 입니다.");
		System.out.println(customer01.toString());
		/*
			품목 : apple
			수량 : 5
			단가 : 1200원
			금액 : 6000원
		*/
		System.out.println();
		//apple	1200원짜리 5개를 구입하려면 6000원이 필요함
		System.out.printf("%s %d원짜리 %d개를 구입하려면 %d원이 필요함", 
						customer01.getItem(), customer01.getCost(), customer01.getQty()
						, customer01.getPrice());
	}
}
