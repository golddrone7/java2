package ifex;

//중첩 if문 : if문 안에 또 다른 if문이 사용되는 구조
public class ifEx2 {
	public static void main(String[] args) {
		
		int age=23;
		
		if(age<=19) {
			System.out.println("애들은 가라~");
		} else {
			if(age>=30) {
				System.out.println("국빈관으로 가세요~");
			} else {
				System.out.println("환영합니다.. 즐거운 시간 보내세요~");
			}
		}	
//		int score=98;
//		char grade;
//		char plus='0';
//		if(score>90) {
//			grade = 'A';
//			if(score>97) {
//				plus='+';
//			}
//			else if(score>93) {
//				plus='0';
//			}
//			else {
//				plus='-';
//			}
//		} else if(score>80) {
//			grade = 'B';
//			if(score>87) {
//				plus='+';
//			}
//			else if(score>83) {
//				plus='0';
//			}
//			else {
//				plus='-';
//			}
//		} else if(score>70) {
//			grade = 'A';
//			if(score>77) {
//				plus='+';
//			}
//			else if(score>73) {
//				plus='0';
//			}
//			else {
//				plus='-';
//			}
//		} else {
//			grade = 'F';
//			plus='0';
//		}
//		System.out.println("학점은 "+grade + plus +"입니다.");	
	}
}
