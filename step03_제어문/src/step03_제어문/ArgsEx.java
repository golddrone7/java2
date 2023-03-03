package step03_제어문;

/* $ java ArgsEx 10 20 30
 * 
 * 세 수의 합 : 60
	3
*/
public class ArgsEx {
	public static void main(String[] e) {
		// 아규먼트 argument
		int sum=0;
		
		for(int i=0; i<e.length; i++) {
			sum += Integer.parseInt(e[i]);
		}		
		System.out.println("args배열의 합 : " + sum);
	}
}
