package test2;

import java.util.Stack;

public class VendingMachine {
	Stack<String> store=new Stack<>();
	
    public synchronized String getDrink() throws InterruptedException {
    	if(store.empty() == true) {
    		wait();
    	}
		String str = store.pop();
//		System.out.println("소비자 : " + str + "꺼내먹음");
		notifyAll();
    	return str;
	}
	
	public synchronized void putDrink(String drink) throws InterruptedException {
		if(store.empty() == false) {
    		wait();
    	}
		store.push(drink);
//		System.out.println("생산자 : " + drink + "자판기에 넣기");
    	notifyAll();
	}
}
