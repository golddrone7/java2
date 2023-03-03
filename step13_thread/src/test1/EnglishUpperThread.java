package test1;

public class EnglishUpperThread extends Thread{
	 char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
             'O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	 
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
