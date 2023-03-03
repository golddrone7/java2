package test1;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		EnglishLowerThread t1=new EnglishLowerThread();
        EnglishUpperThread t2=new EnglishUpperThread();
        KoreanThread t3=new KoreanThread();		
        t1.start();
       t1.join();
        t2.start();
       t2.join();
        t3.start();
	}
}
