package object;




public class ObjectEx2 {
	public static void main(String[] args) {
		//객체를 만들 대상의 클래스는 
		//사용하고자 하는 함수가 있는 클래스로 객체를 생성
		//이림은 뽀로로이고 총점은 253점 입니다
		User user = new User();
		user.setUser("뽀로로", 100, 100, 53);
		//매개변수 입력 후 tab을 누르면 다음으로 넘어감
		System.out.println(user.getUser());
		System.out.println();
	}
}
