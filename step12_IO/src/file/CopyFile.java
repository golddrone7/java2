package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/*	$ CopyFile src/file/data2.txt src/file/data5.txt
	
	src/file/data2.txt파일이 src/file/data5.txt파일로 복사되었습니다
*/
public class CopyFile {

	public static void main(String[] args) throws IOException {
		String file1 = args[0];
		String file2 = args[1];
		
		File file = new File(file1);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
//		System.out.println(file1.length());	// 18
//		System.out.println(file.length());	// 23 <-- 사용
		
		byte[] buf = new byte[ (int)file.length()];
		bis.read(buf, 0, 23);
		System.out.println(new String(buf));
			
		FileWriter fw = new FileWriter(file2);
		fw.write(new String(buf));
		System.out.println(file1 + "파일이 " + file2+"파일이 복사됬습니다.");
		
		fw.close();
		bis.close();
		fis.close();
		
		
		
		
	}

}
