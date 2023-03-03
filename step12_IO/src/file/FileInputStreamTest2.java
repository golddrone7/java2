package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamTest2 {
	public static void main(String[] args) throws IOException, InterruptedException  {
		Reader in = new FileReader("src/file/data2.txt");
		BufferedReader br = new BufferedReader(in);
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
//		int ch = '\0';
//		while((ch=in.read()) != -1) {
//			System.out.print((char)ch);
//			Thread.sleep(100);
//			
//		}
		in.close();
	}
}
