package chat;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIChatServer extends JFrame implements ActionListener {
	TextArea txt_list;
	JButton btn_exit;

	// 테스트 1-------------------
	ServerSocket ss = null;
	// 테스트 1-------------------
	Vector<ChatHandle> inwon = null; // 인원을 카운트 하는 변수

	public GUIChatServer() {
		super("Chatting Server");

		txt_list = new TextArea();
		btn_exit = new JButton("서버종료");

		add(txt_list, "Center");
		add(btn_exit, "South");
		setSize(250, 250);
		setVisible(true);
		// 이벤트처리-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
		// ----------------------------------
		inwon = new Vector<>(); // serverStart() 보다 먼저 동작
		// null포인터 익셉션
		serverStart();
	}

	public void serverStart() {
		final int PORT = 7500;
		try {
			ss = new ServerSocket(PORT);
			while (true) {
				Socket sock = ss.accept();
				String str = sock.getInetAddress().getHostAddress();
				txt_list.append(str);
				// 테스트2-------------------------
				// 병행처리를 하기위한 client 객체생성(사용자정의 클래스)
				ChatHandle ch = new ChatHandle(this, sock);
				inwon.add(ch);
				ch.start();

				// 테스트2-------------------------
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_exit)
			System.exit(0);
	}

	// 테스트2------------------------------
	public void setMsg(String str) {
		txt_list.append(str);
	}

	// 테스트2------------------------------
	public static void main(String[] args) {
		new GUIChatServer();
	}

}

class ChatHandle extends Thread {
	GUIChatServer server;
	Socket sock;
	PrintWriter pw = null;
	BufferedReader br = null;

	public ChatHandle() {
	}

	public ChatHandle(GUIChatServer server, Socket sock) {
		this.server = server;
		this.sock = sock;
		InputStream is;
		try {
			is = sock.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));

			OutputStream os = sock.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(os));

		} catch (IOException e) {
		}
	}

	@Override
	public void run() {
		String nickname = null;
		try {
			nickname = br.readLine();
			server.setMsg("[" + nickname + "]님이 입장하셨습니다\n");
			// 테스트3-----------------
			broadcast("[" + nickname + "]님이 입장하셨습니다\n");
			// 테스트3----------------------

			while (true) {
				try {
					String text = br.readLine();
					server.setMsg(nickname + " : " + text + "\n"); // 서버쪽에 출력
					broadcast(nickname + " : " + text + "\n");
				} catch (IOException e) {
					return;
				}
			}
			//테스트4-------------------------------
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//테스트5-------------------------------
		} finally {
			synchronized (server.inwon) {
				server.inwon.remove(this);
				server.setMsg("[" + nickname + "]님이 퇴장하셨습니다\n");
				broadcast("[" + nickname + "]님이 퇴장하셨습니다\n");
				
			}
		}
		
	}

	// 테스트3-------------------------------
	// 모든 접속자에게 메시지를 보내줌
	public void broadcast(String str) {
		synchronized (server.inwon) { // 동기화처리
			int n = server.inwon.size(); // 접속자 객체의 수
			for (int i = 0; i < n; i++) {
				ChatHandle ch = server.inwon.elementAt(i);
				ch.pw.println(str);
				ch.pw.flush();
			}

		}
	}
	// 테스트3-------------------------------
}
//----------------------------테스트2
