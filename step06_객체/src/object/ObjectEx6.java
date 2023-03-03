package object;


/* 클래스명 : MemberPhone
 * -name:String
 * -phone:String
 * +input():void		<== 이름과 전화번호 입력
 * +output():void		<== 출력
*/
public class ObjectEx6 {
	public static void main(String[] args) {
		MemberPhone Galaxy20 = new MemberPhone();
		Galaxy20.input();
		Galaxy20.output();
	}
}
