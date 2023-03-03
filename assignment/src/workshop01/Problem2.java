package workshop01;

/*
 *ascii 값 ‘A’ -> 65
ascii 값 ‘B’ -> 66
ascii 값 ‘1’ -> 49
ascii 값 ‘2’ -> 50 
 * 
 * 
*/
public class Problem2 {

	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		char c4 = '2';
		int inx = 2;
		System.out.println(s1 + s2);	//12
		System.out.println(!bnx);		//true
		System.out.println(s1 + (inx+1) +s1); 		// 131
		System.out.println(c2+1);		// 51
		System.out.println(c3+c4);		// 99
	}

}
