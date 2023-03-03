package test2;

public class Producer extends Thread{
	VendingMachine vm;
	public Producer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " 음료수 No. "+i+" 자판기에 넣기 ");
				vm.putDrink("음료수 No. " + i);
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}





