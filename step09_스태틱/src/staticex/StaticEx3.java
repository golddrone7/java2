package staticex;

class Counter  {
    static int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }
    
    int getCount() {
    	return count;
    }
}


public class StaticEx3 {
	public static void main(String[] args) {
		Counter c1 = new Counter();
        Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
		System.out.println(c3.getCount());
	}
}
