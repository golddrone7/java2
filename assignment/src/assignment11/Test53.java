package assignment11;

import java.util.StringTokenizer;

/*
[문제 53] 문자열변수에 "10*30*20*40*50"를 대입한후 StringTokenizer클래스를 
         이용하여 다음결과를구하시오

(1) Test53클래스 main()에서 
     String str="10*30*20*40*50";
     //나머지를 완성하시오


[결과화면]
10+30+20+40+50=150

*/
public class Test53 {

	public static void main(String[] args) {
		int sum = 0;
		String str="10*30*20*40*50*70*100";
		StringTokenizer st = new StringTokenizer(str, "*");
		while(true) {
			int num = Integer.parseInt(st.nextToken());
			if(st.hasMoreTokens() == false) {
				System.out.print(num+"=");
				sum+=num;
				break;
			}		
			System.out.print(num+"+");
			sum+=num;
		}
		System.out.println(sum);
	}
	
	
		
}
