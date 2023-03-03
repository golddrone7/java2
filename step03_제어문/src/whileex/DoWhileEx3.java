package whileex;
/* 65~90사의 임의의 난수 10개를 생성

*/

public class DoWhileEx3 {
	public static void main(String[] args) {
		
		int num;
		int cnt=0;
				
		do {
			num = (int)(Math.random()*26)+65;
			System.out.print(num + " ");
			cnt++;
		} while(cnt<10);
		
	}
}
