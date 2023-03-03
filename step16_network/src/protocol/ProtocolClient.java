package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	
	Socket sock = null;
	BufferedReader keyboard = null;
	BufferedReader br = null;
	BufferedWriter bw  = null;
	public ProtocolClient()  {
		try {
			sock = new Socket("127.0.0.1", 7000); // 자기 자신의 컴퓨터와 통신 포트번호는 7000으로 지정
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을수 없습니다.");
			System.exit(0); // 종료시켜줘야 서버에 부하가 안걸림.
		} catch (IOException e) {
			System.out.println("서버와 연결할 수 없습니다");
			System.exit(0);
		} 
		try {
		//키보드와 연결된 스트림 
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		//sock과 연결되는 스트림
		br=new BufferedReader(
				new InputStreamReader(sock.getInputStream()));
		bw=new BufferedWriter(
				new OutputStreamWriter(sock.getOutputStream()));
		
		
		while(true) {
			// 메시지를 받아서 서버로 전송
			System.out.println("ex) 100:아이디(입장), 200:아이디(퇴장), "
					+ "300:아이디:메시지(대화), 400:아이디1:아이디2:메시지(귓속말)");
			System.out.print("메시지를 입력하세요 : ");
			String msg = keyboard.readLine();
			bw.write(msg+"\n");
			bw.flush();
			
			msg = br.readLine();
			System.out.println(msg);
		}
		
		} catch(IOException e) {
			System.out.println("서버와 연결이 끊어짐");
			System.exit(0);
		}
		
		
		
		
	}
	
	public static void main(String[] args)  {
		new ProtocolClient();
	}
}
