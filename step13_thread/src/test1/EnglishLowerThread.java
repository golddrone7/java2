package test1;

public class EnglishLowerThread extends Thread{
	 char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
             'o','p','q','r','s','t','u','v','w','x','y','z'};

	 @Override
	 public void run() {
		 for(char c : arr) {
			 System.out.print(c + " ");
			 try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println();
	 }

}
