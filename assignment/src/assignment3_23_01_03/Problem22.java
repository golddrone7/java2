package assignment3_23_01_03;
/*
[문제 22] 아래 문자열 배열의 데이터의 길이를 구하시오(단일 for문)
String[] color={"red","green","blue","yellow","pink"};
힌트) color[0].length

--출력--
red는(은) 3글자 입니다
green는(은) 5글자 입니다
blue는(은) 4글자 입니다
yellow는(은) 6글자 입니다
pink는(은) 4글자 입니다
*/

public class Problem22 {

	public static void main(String[] args) {
		String[] color={"red","green","blue","yellow","pink"};
		
		for(int i=0; i<color.length; i++) {
			System.out.println(color[i]+"는(은) "+color[i].length()+"글자 입니다");
		}
		
		
	}
}
