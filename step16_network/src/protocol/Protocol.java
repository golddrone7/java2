package protocol;

/*	100:아이디			--- 입장
 *  200:아이디			--- 퇴장
 *  300:아이디:메시지		--- 대화방에 접속한 사람에게 메시지 전달
 *  400:아이디1:아이디2:메시지	--- 아이디1이 아이디2에게 귓말
*/
public class Protocol {		
	public static final String ENTER="100";
	public static final String EXIT="200";
	public static final String SEND_MESSAGE="300";
	public static final String SECRET_MESSAGE="400";
	
}
