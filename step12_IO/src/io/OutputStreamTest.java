package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str = "재미있는 자바IO프로그래밍을 공부하는 중.";
		bw.write(str);  // System.out.println(); 과 동일		
		bw.flush();		// 데이터를 지정한 위치까지 밀어내줘야 함.
						//버퍼 비우기, 밀어내기
		bw.close();
		
		
	}

}
