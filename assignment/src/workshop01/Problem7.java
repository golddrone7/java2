package workshop01;

/*
	선언된 정수형 데이터가 홀수인지 짝수인지 출력한다.
	단, 연산처리는 삼항 연산자를 이용한다.
	선언 변수 : int inx = 5;
*/
public class Problem7 {

	public static void main(String[] args) {
		int i = 5;
		String result = i % 2 == 0 ? "숫자 "+i+"는 짝수입니다" : "숫자 "+i+"는 홀수입니다";
		System.out.println("선언 변수 " + i + "일때 결과: \n" + result);
	}

}
