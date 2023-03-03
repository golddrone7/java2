package tv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 결합도가 높은 코드, 응집도는 높아야 하고 결합도는 낮춰야 함

public class TvUser {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("회사이름을 입력하세요 : ");
			String com = br.readLine();
			
			
			
			if(com.equals("LG") || com.equals("lg")) {	// 문자열의 비교는 equals 메서드를 사용
				LgTv lg = new LgTv();
				lg.powerOn();
				lg.volumeUp();
				lg.volumeDown();
				lg.powerOff();
			} else if(com.equals("SAMSUNG") || com.equals("samsung")) {
				SamsungTv st = new SamsungTv();
				st.turnOn();
				st.soundUp();
				st.soundDown();
				st.turnOff();
			} else {
				System.out.println("어디 회사 제품이에요?");
			}
			
		} catch(IOException e) {
			System.out.println("IO Exception 이 발생했습니다.");
		}
		
			// 결합도는 낮추고 응집도는 높이자!!
		
		
		
		
		
		
		
	}

}
