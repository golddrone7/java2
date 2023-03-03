package object;

import java.io.Serializable;

//데이터를 직렬화해서 파일로 변환
// 파일에서 역직렬화로 값을 받아옴
public class UserInfo implements Serializable {	// 객체 직렬화 할 때 Serializable 상속
	/**	
	 * 
	 */
	private static final long serialVersionUID = 2L;	// 만들때 1번으로 만들면 읽을때도 1번
														// 만들때 1번인데 2번으로 읽으면 Exception 발생
	private String name;
	private int age;
	private double score;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public void disp() {
		System.out.print("이름 : " + name);
		System.out.print("\t나이 : " + age);
		System.out.println("\t점수 : " + score);
	}
	
}
