package network;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddressEx1 {
														/* 웹 서버 구성 */
	public static void main(String[] args) throws UnknownHostException, MalformedURLException { 	
														/* DNS 서버 */
														/* 숫자 주소 */
														/* 도메인 */

		InetAddress addr1 = InetAddress.getByName("naver.com");
		InetAddress addr2 = InetAddress.getLocalHost(); // InetAddress 자바에서 사용하는 클래스
//		InetAddress addr1 = InetAddress.getByName("www.google.co.kr");
//		InetAddress addr1 = InetAddress.getByName("127.0.0.1");
		URL url = new URL("http://127.0.0.1:80");
		//	루프백주소 -> 127.0.0.1	2^32개
		//  자기 자신을 호출
		System.out.println("addr1: " + addr1.getHostName()); 
		System.out.println("addr1: " + addr1.getHostAddress()); 
		
		System.out.println("addr2: " + addr2.getHostName());  // DESKTOP-2PGRMF4
		System.out.println("addr2: " + addr2.getHostAddress()); // 사설 IP주소 172.30.1.33
			
		System.out.println("protocol : " + url.getProtocol()); // 정상적인 프로토콜 값만 들어옴(TCP, https...)
		System.out.println("port : " + url.getPort()); // -1, 포트가 설정이 되지 않을 때, 분해작업
		
		
		
	
	}

}
