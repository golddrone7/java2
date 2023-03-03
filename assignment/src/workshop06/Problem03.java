package workshop06;

public class Problem03 {

	public static void main(String[] args) {
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		for(int i=num; i<=10; i++) {
			if(i%3==0 || i%5 == 0) continue;
			System.out.print(i + " ");			
			sum+=i;
			if(i<8)
				System.out.print("+ ");
		}
		System.out.println();
		System.out.println("결과 : " + sum);
	}
}
