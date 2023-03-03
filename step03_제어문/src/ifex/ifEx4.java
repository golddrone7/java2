package ifex;
/* 문제. 중첩 if를 이용하여 프로그램을 작성하세요
 * 3개 과목의 점수를 입력 받아서 합격인지 불합격인지 출력하세요
 * 3개 과목이 전부 40점 이상이어야 하고 평균이 60이상이면 "합격"
 * 평균이 60점이 넘지만 1개 과목이라도 40점 미만이면 "과락으로 불합격"
 * 평균이 60미만이면 "불합격"
 * 
 * --출력결과--
 * 국어점수입력 : 95
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 합격
 * 
 * 국어점수입력 : 35
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 과락으로 불합격
 * 
 * 국어점수입력 : 45
 * 영어점수입력 : 55
 * 수학점수입력: 22
 * 결과 : 불합격
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifEx4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int kor, eng, math, tot;
		double avg;
		String result="불합격";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어점수입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수입력 : ");
		math = Integer.parseInt(br.readLine());
		System.out.println(String.format("국어점수 %d, 수학점수 %d, 영어점수 %d", 
									kor, math, eng));
		
//		if((kor+eng+math)/3 < 60) {
//			result = "불합격";
//		}

		if((kor+eng+math)/3 >=60) {
			if(kor<40 || eng<40 || math<40) {
				result = "과락으로 불합격";
			}else {
				result = "합격";
			}
			
//			if(kor>=40 && eng>=40 && math>=40) {
//				result = "합격";
//			} else {
//				result = "과락으로 불합격";
//			}
		}	
		System.out.println("결과 : "+result);
		
	
	}
}
