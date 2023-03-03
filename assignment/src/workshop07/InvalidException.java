package workshop07;

public class InvalidException extends Exception {
	public InvalidException() {
		super();
		System.out.println("입력 값에 오류가 있습니다.");
	}
}
