package assignment4_23_01_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[문제 27]콘솔에서 값을 입력받고 메서드를 호출해서 프로그램을 구현하시오.
             (BufferedReader을 이용)
(1)계산방법
   금액 = 수량 * 단가
(2)처리조건
    ①main메서드 에서 품명과 수량, 단가를 입력 받으시오
    ②compute() 메서드로 값을 전달하여 계산과 출력하시오
    ③메서드 구현 : +compute(item, qty, price):void 
                          (+ 는 public이라는 의미임)
(3) 입.출력화면
품명을 입력하시오 : apple         <----main()에서 처리
수량을 입력하시오 : 10
단가를 입력하시오 : 1200
 
품명 : apple                            <---compute()에서 처리
금액 : 12000원


*/
public class Problem27 {
	
	public static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + (qty * price));
	}
	
	public static void main(String[] args) throws IOException {
		String product;
		int qty, price;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("품명을 입력하시오 : ");
		product = br.readLine();
		System.out.print("수량을 입력하시오 : ");
		qty = Integer.parseInt(br.readLine());
		System.out.print("단가를 입력하시오 : ");
		price = Integer.parseInt(br.readLine());
		System.out.println();
		compute(product, qty, price);
		
		
		
	}

}
