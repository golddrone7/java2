package factory;

public class FactoryMain {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Buyer buyer = new Buyer(factory);
		Worker worker = new Worker(factory);
		
		buyer.start(); // 소비
		worker.start(); // 생산
		
		// 생산을 5개까지 하고 중지 함
		// 쓰레드 조정
		
		
		
	}
}
