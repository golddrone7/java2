package factory;

/* 스레드 조정
 * 두개의 쓰레드가 데이터를 주고 받을때 발생하는
 * 쓰레드의 정지, 실행과 관련한 문제를 제어하는 용도로 사용
 * wait(), notifyAll()을 사용
 * 
 * wait() : 쓰레드에 대한 일시 정지를 통해 대기 상태로 만듬
 * notify() : 쓰레드를 깨워서 다시 실행
 * notifyAll() : 모든 쓰레드를 깨워서 다시 실행
 * 

*/
public class Factory {
	private int product =0;
	
	public synchronized void produce() { // 생산
		if(product>4) {
			System.out.println("생산 중단 : " + product);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end if
		
		product++;
		System.out.println("생산 : " + product);
		notifyAll();
	}

	public synchronized void sell() {//소비
		if(product<1) {
			System.out.println("소비 중단 : " + product);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end if
		product--;
		System.out.println("소비 : " + product);
		notifyAll();
	}
	
}
