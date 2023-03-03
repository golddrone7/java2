package test2;

public class Consumer extends Thread {
	VendingMachine vm;
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		try {
			for(int i=1; i<=10; i++)
				System.out.println(Thread.currentThread().getName() + " "+vm.getDrink()+"꺼내먹음 ");
				vm.getDrink();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
