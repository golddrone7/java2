package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) {

		//input
		try {
		FileInputStream file = new FileInputStream("src/io/result.txt");
		DataInputStream dis = new DataInputStream(file);
		
		
		System.out.println("이름 : " + dis.readUTF());
		System.out.println("나이 : " + dis.readInt());
		System.out.println("신장 : " + dis.readDouble());
		
		System.out.println("이름 : " + dis.readUTF());
		System.out.println("나이 : " + dis.readInt());
		System.out.println("신장 : " + dis.readDouble());
		
		// 읽는 것은 flush 개념이 없음,, 내보내기만 flush
		dis.close();
		file.close();
		
		} catch(FileNotFoundException e) {
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		//Output
//		try { // 웹 프로그래밍할 때 경로를 잘 적어줘야 찾음
//			FileOutputStream file = new FileOutputStream("src/io/result.txt"); // 상대경로 (하위경로)
//			DataOutputStream dos = new DataOutputStream(file);
//			dos.writeUTF("둘리");
//			dos.writeInt(23);
//			dos.writeDouble(173.5);
//
//			dos.writeUTF("도우너");
//			dos.writeInt(22);
//			dos.writeDouble(171.1);
//			dos.flush();    // class에 f4 누르면 정보
//			
//			dos.close();
//			file.close();
//			System.out.println("result.txt 파일이 저장되었습니다");
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없습니다.");
//			e.getMessage();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
