package instance;


// instanceof 를 이용한 연산의 결과가 true일 경우
// 참조변수가 검사한 타입으로 형변환이 가능함





//class A{
//	
//}
//
//class B extends A{
//}

class Government{}			// 정부
class Education extends Government{}	//교육부
class Justice extends Government{}		//법무부


public class InstanceofEx1 {

	public static void main(String[] args) {
		
		Government gov = new Government();
		Education edu = new Education();
		
		
		System.out.println(edu instanceof Government); // true, 상속관계일때만 사용가능
		//edu 객체가 Government자료형으로 형변환이 가능한가?
		
		System.out.println(gov instanceof Justice); // false
		//gov 객체가 Justice 자료형으로 형변환이 가능한가?
		
//		System.out.println(edu instanceof Justice); // error, 상속관계일때만 사용가능
//		A a = new A();
//		A b = new B();
//		
//		if(a instanceof A)
//			System.out.println("a는 A의 객체입니다.");
//		if(a instanceof B)
//			System.out.println("a는 B의 객체입니다.");
//		
//		if(b instanceof A)
//			System.out.println("b는 A의 객체입니다.");
//		
//		if(b instanceof B)
//			System.out.println("b는 B의 객체입니다.");
		
		
		
	}

}
