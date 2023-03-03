package assignment10;

/*
[문제 49] 다음프로그램을 완성하시오

(1)클래스명 : Profile
    +name:String
    +phone:String

    +Profile()
    +Profile(name:String,phone:String)
    +printView():void         //이름,연락처출력

(2)인터페이스명 : Score
   +num:int (초기값: 10)
   +scoreResult(sol:int):void //점수를 계산해서 출력(sol*num)

(3)인터페이스명:Display
   메서드 : +display():void        
  
(4)Test49클래스 main()에서  Profile, Score, Display를 상속받아 처리하시오
      -score:int;             // 점수
              :
		
      public static void main(String[] args){   // main()안에 더이상 코드는 추가하지 마시오
            Test46  ob = new Test46("홍길동","123-4567", 5);
            ob.display();
      }

[결과화면]
이름: 홍길동
연락처: 123-4567
점수: 50점

*/
public class Test49 extends Profile implements Display, Score{
	private int score;

	public Test49(String name, String phone, int score) {
		// TODO Auto-generated constructor stub
		super(name, phone);
		this.score = score;
	}

	public static void main(String[] args) {
		Test49  ob = new Test49("홍길동","123-4567", 5);
        ob.display();
	}

	@Override
	public void scoreResult(int sol) {
		System.out.println("점수 : " + (sol*score) + "점");
	}

	@Override
	public void display() {
		printView();
		scoreResult(10);
	}

}
