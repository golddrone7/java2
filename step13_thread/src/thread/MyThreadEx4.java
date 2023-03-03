package thread;

//대몬 쓰레드	daemon thread
/* 일반 쓰레드가 종료되면 대몬 쓰레드를 강제로 종료
 * 일반 쓰레드가 종료되면 대몬 쓰레드의 존재의미가 없음
 * ex)hwp의 자동 저장, 화면자동 갱신
 *
*/



class DaemonTest extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(300);
				System.out.println("hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



public class MyThreadEx4 {
	public static void main(String[] args) {
		
		DaemonTest th = new DaemonTest();
		th.setDaemon(true); // th가 daemon thread로 바꿔줌
		th.start();
		
		int n=0;
		while(n<10) {
			n++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
