package object;
//클래스 다이어그램
/* - private, + public, # protected
 * 클래스명 : Person
 * +name : String
 * +age : int
 * +score : float
 * 
 * +setPerson(n:String, a:int, s:float):void
 * +viewPerson() : void
*/
class Person{
	public String name; // 변수, 멤버변수, 필드 field, 전역변수(클래스 안에서만)
	public int age;
	public float score;
	Person(){
		name = "No Name";
		age = -1;
		score = -1.0f;
	}
	
	public void setPerson(String n, int a, float s) {
		// 멤버함수, 메서드(method)
		name = n;
		age = a;
		score = s;
	}
	
	public void viewPerson() { // 단어 사이 대문자 "카멜 표기법"
		System.out.println("이름은 "+name+"\n"
				+ "나이는 "+age);
		System.out.printf("점수는 %.2f\n\n", score);
	}
}


public class ObjectEx1 {
	
	public static void stringEx(String name1) {
		name1 = "김자바";
	}
	public static void main(String[] args) {
		Person pp = new Person(); // 객체 생성
		// new Person() : 힙 영역에 메모리를 할당하고 인스턴스 생성
		pp.setPerson("김자바", 21, 59.4f);
		pp.viewPerson();
		pp.name = "안자바";
		pp.viewPerson();
		
		System.out.println("pp.hashCode() = " + pp.hashCode()); 
		//hashCode() : 객체의 참조주소를 10진 정수로 리턴
		pp = new Person();
		System.out.println("pp.hashCode() = " + pp.hashCode());
	
		pp = new Person();
		System.out.println("pp.hashCode() = " + pp.hashCode());
		
		Person p3 = pp;
		System.out.println("p3.hashCode() = " + p3.hashCode());
		System.out.println(p3.hashCode() == pp.hashCode() ? "p3와 pp의 객체는 같음" : "다름");
		
		Person p2 = new Person();
		System.out.println("p2.hashCode() = " + p2.hashCode());
		
		
		Person[] person1 = new Person[5];
		String[] name = {"강남", "수원", "강북", "강동", "강서"};
		
		for(int i=0; i<person1.length; i++) {
			person1[i] = new Person();
			person1[i].setPerson(name[i], (int)(Math.random()*25) + 15, 
					(float)(Math.random()*101));
		}
		
		for(int i=0; i<person1.length; i++)
			person1[i].viewPerson();
		
	}
}


