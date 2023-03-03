package algorithm;




public class MyThread {

	public static void main(String[] args) {
		Thread_Ex2 t1 = new Thread_Ex2();
		
		Runnable r = new Thread_Ex1();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}

class Thread_Ex1 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<500; ++i) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


class Thread_Ex2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; ++i) {
			System.out.println(getName());
		}
	}
	
	
}