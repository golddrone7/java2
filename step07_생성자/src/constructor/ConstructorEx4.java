package constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 클래스명 : ConstructorEx4
 * x:int
 * y:int
 * +ConstructorEx4() <== 입력 받기
 * +calc():int 	<== x*y 리턴
 * +display() : void <== 출력하기


*/
public class ConstructorEx4 {
	int x;
	int y;
	public ConstructorEx4() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x를 입력하시오 : ");
		x = Integer.parseInt(br.readLine());
		System.out.print("y를 입력하시오 : ");
		y = Integer.parseInt(br.readLine());
	}
	
	public int calc() {
		return x*y;
	}
	        
	public void display() {
		System.out.println(x+" * "+y+"의 값은 "+calc());
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		new ConstructorEx4().display();	// .display()는 포함의 의미
//		ConstructorEx4 ob = new ConstructorEx4();
//		ob.display();	
	}

}
