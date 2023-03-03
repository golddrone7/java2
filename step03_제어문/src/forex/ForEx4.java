package forex;

// 1~100 사이의 정수 중에서 7의 배수만 출력, continue를 사용하세요
// 7 14 21 .. 98

public class ForEx4 {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%7!=0) 
				continue;		
			System.out.print(i + " ");
		}
	}
}

