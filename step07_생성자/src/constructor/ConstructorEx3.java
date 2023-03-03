package constructor;

/*	클래스명 : UserInfo
 * -name:String
 * -addr:String
 * +UserInfo()
 * +UserInfo(name:String, addr:String)
 * +getter
 * ------------------------------------
 * *** 주소록 ***
 * 
*/
public class ConstructorEx3 {
	public static void main(String[] args) {
		UserInfo ob = new UserInfo("블랙핑크", "강남구 역삼동");
		System.out.println("이름 : " + ob.getName());
		System.out.println("주소 : " + ob.getAddr());
	}
}
