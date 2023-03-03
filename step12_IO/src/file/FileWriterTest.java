package file;

import java.io.FileWriter;
import java.io.IOException;

/* 경로 
 * 절대경로 : 루트 디렉토리를 기준으로 경로를 표시
 * 상대경로 : 현재의 위치한 디렉토리를 기준으로 경로를 표시
 * 			. 현재 디렉토리
 * 			.. 상위 디렉토리
 * 			/ 루트 디렉토리(최상위 디렉토리)
 * 
 

*/
public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter writer = null;
		writer = new FileWriter("C:\\java\\java_lec\\step12_IO\\storage\\data3.txt");

		StringBuilder str = new StringBuilder();
		str.append("동해물과 백두산이 마르고 닳도록\n ");
		str.append("하느님이 보우하사 우리나라만세\n ");
		str.append("무궁화 삼천리 화려강산 \n");
		str.append("대한사람 대한으로 길이 보전하세\n");
		
		writer.write((str.toString()));
		writer.write("\nhelloWorld");
		writer.close();
		System.out.println("data3.txt로 저장되었습니다.");
	}

}
