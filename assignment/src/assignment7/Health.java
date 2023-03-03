package assignment7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
(1)클래스명 : Health
      +gender:char        (성별)
      +tall:double          (신장)
      +weight:double     (체중)
      +Health()
      +input():void          - 성별, 신장, 체중을 입력받는다
      +output():String     - 성별, 신장, 체중을 문자열로 만들어 리턴한다


*/
public class Health {
	public char gender;
	public double tall;
	public double weight;
	
	public Health() {
		
	}
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("성별(M/F)을 입력하시오:  ");
		gender = br.readLine().charAt(0);
		System.out.print("신장(Cm)을 입력하시오: ");
		tall = Double.parseDouble(br.readLine());
		System.out.print("체중(Kg)을 입력하시오: ");
		weight = Double.parseDouble(br.readLine());
	}
	
	public String output() {
		return "**비만도 측정 결과**\n"
				+ "성별: "+gender+" \r\n"
				+ "신장: "+String.format("%.1f", tall)+"Cm\n"
				+ "체중: "+String.format("%.2f", weight)+"Kg\n";
	}
	
	
}
