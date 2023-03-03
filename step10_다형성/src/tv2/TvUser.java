package tv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다형성을 이용하여 결합도를 낮춘다.
public class TvUser {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("회사이름을 입력하세요 : ");
			String com = br.readLine();
			
			Tv tv = null;
			
			if(com.equals("LG") || com.equals("lg")) {	// 문자열의 비교는 equals 메서드를 사용
				tv = new LgTv();
	
			} else if(com.equals("SAMSUNG") || com.equals("samsung")) {
				tv = new SamsungTv();

			} else {
				System.out.println("어디 회사 제품이에요?");
			}
			tv.powerOn();
			tv.soundOn();
			tv.soundOff();
			tv.powerOff();
			
		} catch(IOException e) {
			System.out.println("IO Exception 이 발생했습니다.");
		}
		
			
		
		
		
		
		
		
	}

}
