package test1;

public class KoreanThread extends Thread {
	 char[] arr={'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
	 public KoreanThread() {
		// TODO Auto-generated constructor stub
	}
	 
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
