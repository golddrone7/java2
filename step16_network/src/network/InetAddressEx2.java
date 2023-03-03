package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
//nslookup
public class InetAddressEx2 {
	public static void main(String[] args) throws IOException   {
		String host = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("홈페이지 주소 : ");
		host = br.readLine();
		InetAddress[] addr = InetAddress.getAllByName(host);
		System.out.println(host+"는 " +addr.length + "개의 ip주소를 가지고 있음");	
		//naver.com는 4개의 ip주소를 가지고 있음
		for(int i=0; i<addr.length; i++) {
			System.out.println((i+1)+"번 ip주소는 " + addr[i].getHostAddress());
		}
		br.close();
		
	}

}
