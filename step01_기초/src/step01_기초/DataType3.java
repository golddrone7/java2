package step01_기초;

/* 문제. 각각의 변수에 대입하여 출력하세요
 * 이름 : 이순신	<== println()
 * 나이 : 25세	<== print()
 * 부서 : 개발부	<== printf()
 * 성적 : 87.5점	
*/

public class DataType3 {
	public static void main(String[] args) {
		String name = "이순신";
		int age = 25;
		String department = "개발부";
		double score = 87.5;
		// \r 캐리지리턴	현재 커서를 맨앞으로 보내고 줄바꿈을 실행 
		// \n 뉴라인 		줄바꿈
		
		System.out.println("이름 : "+name);
		System.out.print("나이 : "+age+"세\n");
		//System.out.printf("부서 : %s\n",department);
		System.out.printf("부서 : %s\r성적 : %.1f점\n",  department, score);
		//System.out.printf("성적 : %.1f점\n",score);

	}
}







