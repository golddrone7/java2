package assignment10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
(1)클래스명 : ThrowEx
   +dan:int   
   +inputData():void    ==> 단 입력받기
   +guguPrint():void    ==> 구구단 구하기

*/
public class ThrowEx {
	public int dan;

	public void inputData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("단 입력 : ");
		dan = Integer.parseInt(br.readLine());
		guguPrint();
		} catch(Exception e) {
			System.out.println("정수값만 입력해 주시오");
		} finally {
			br.close();
		}
		
	}
	
	public void guguPrint() {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}
}
