package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	
	ServerSocket ss = null;
	Socket sock = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	public ProtocolServer() throws IOException {
		ss=new ServerSocket(7000); // 서버에 7000번 포트번호를 지정했으니, 클라이언트에서 7000번으로 접근해야함
		System.out.println("접속 대기중..."); // 요청에 대한 대기
		sock = ss.accept(); // 접속 시도가 있는지 확인해서 응답
		
		br = new BufferedReader(
				new InputStreamReader(sock.getInputStream()));
		bw = new BufferedWriter(
				new OutputStreamWriter(sock.getOutputStream()));
		while(true) {
			
			String buf = br.readLine();
			String[] words = buf.split(":"); // 읽어온 문자열을 구분자(:)로 분리
			
			if(words[0].equals(Protocol.ENTER)) { // 입장 	
				enter(words);
			} else if(words[0].equals(Protocol.EXIT)) {
				exit(words);
			} else if(words[0].equals(Protocol.SEND_MESSAGE)) {
				sendMessage(words);
			} else if(words[0].equals(Protocol.SECRET_MESSAGE)) {
				secretMessage(words);
			} else {
				bw.write("잘못된 요청입니다");
				bw.flush();
			}
			 
		}
	
	}
	//400:뽀로로:크롱:안녕
	//[뽀로로]가 [크롱]에게 귓속말 보냄
	//[뽀로로] 안녕
	private void secretMessage(String[] words) {
		System.out.println("["+words[1]+"]가 ["+words[2]+"]에게 귓속말 보냄");
		System.out.println("["+words[1]+"] "+words[3]+" \n");
		
	}
	private void sendMessage(String[] words) throws IOException {
		//300:뽀로로:안녕
		System.out.println("["+words[1]+"] "+words[2]+" \n");
	}

	private void exit(String[] words) {
		System.out.println("["+words[1]+"]님이 퇴장하셨습니다\n");
	}

	public void enter(String[] words) {
		//100:뽀로로
		System.out.println("["+words[1]+"]님이 입장하셨습니다\n");
	}
	
	public static void main(String[] args) throws IOException {
		new ProtocolServer();
	}
}
