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
public class Sales {
	
	private String item;
	private int qty;
	private int cost;
	
	public int getPrice() {
		return qty * cost;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString() {
		return "품목 : "+item+"\r\n"
				+ "수량 : "+qty+"\r\n"
				+ "단가 : "+cost+"원\r\n"
				+ "금액 : "+getPrice()+"원";
	}
	
}
