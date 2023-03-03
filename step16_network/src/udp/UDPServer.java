package udp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
PDU Protocol Data Unit

*/


public class UDPServer {
	
	public static void main(String[] args) {
		final int buffer=50;
		final int port = 8000;
		String message = "";
		PrintStream ps = new PrintStream(System.out);
		try {
			DatagramSocket ds = new DatagramSocket(port);
			ps.print("접속 대기중...");
			while(true) {
				byte[] buf=new byte[buffer];
				DatagramPacket dp = 
						new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				message = new String(dp.getData());
				message = message.trim();
				ps.print("\n들어온 메시지 : " + message);
				ps.flush();
				message="";
				
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // udp소켓 생성
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps.close();
		}
		
		
	}

}
