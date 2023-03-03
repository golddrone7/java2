package workshop08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test01 {

	public static void main(String[] args) throws IOException {
		double[] num = new double[5];
		double score = 0;
		boolean flag = false;
		String grade;
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			if(tk.countTokens()==5) {		
				for(int i=0; i<5; i++) {
					flag = true;
					num[i] = Double.parseDouble(tk.nextToken());
					if(num[i]<10 || num[i]>100) {
						System.out.println("다시 입력 하세요 10~100");
						flag= false;
						break;
					}
				}
			} else
				System.out.println("다시 입력 하세요 5개");
			
			if(flag==true)
				break;
		}

		score = ((num[0]+num[1])/2 * 0.6) + ((num[2]+num[3])/2 * 0.2) + num[4] * 0.2;
		switch((int)score/10) {
		case 10:
		case 9: grade = "Gold Class"; break;
		case 8: grade = "Silver Class"; break;
		case 7: grade = "Bronze Class"; break;
		default : grade = "Normal Class"; 
		}
		System.out.println("평가점수: "+score+"점");
		System.out.println("Class: " + grade);
	}

}
