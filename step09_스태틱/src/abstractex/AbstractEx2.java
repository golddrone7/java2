package abstractex;

//동일한 클래스여도 패키지만 다르면 상관없음
abstract class Shape {
	abstract public void onDraw();

	abstract public void onDelete();
}

class Rectangle extends Shape {

	@Override // 타입체크 강화 , 메서드 재정의 
	public void onDraw() {
		System.out.println("사각형을 그립니다.");
		System.out.println("______________");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("￣￣￣￣￣￣￣￣￣￣￣");
	}

	@Override
	public void onDelete() {
		System.out.println("사각형을 지웁니다.");
	}
}

class Triangle extends Shape {

	@Override
	public void onDraw() {
		System.out.println("삼각형을 그립니다.");
	}

	@Override
	public void onDelete() {
		System.out.println("삼각형을 지웁니다.");
	}
}

class Circle extends Shape {
	@Override
	public void onDraw() {
		System.out.println("원을 그립니다.");
		System.out.println();
		for (int i = -1; i < 9; i++) { // i가 0일때 j는 10, i가 1일 때 9~11, i가 2일때 8~12
			for (int j = 0; j < 17; j++) {
				if(i==-1 && 7<=j && j<=9)
					System.out.print("*");
				else if(i==0 && 6<=j && j<=10)
					System.out.print("*");
				else if(i==1 && 4<=j && j<=12)
					System.out.print("*");
				else if(i==2 && 2<=j && j<=14)
					System.out.print("*");
				else if(i==3 && 0<=j && j<=16)
					System.out.print("*");
				else if(i==4 && 0<=j && j<=16)
					System.out.print("*");
				else if(i==5 && 2<=j && j<=14)
					System.out.print("*");
				else if(i==6 && 4<=j && j<=12)
					System.out.print("*");
				else if(i==7 && 6<=j && j<=10)
					System.out.print("*");
				else if(i==8 && 7<=j && j<=9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	@Override
	public void onDelete() {
		System.out.println("삼각형을 지웁니다.");
	}
}

public class AbstractEx2 {
	public static void main(String[] args) {
		Shape sh;
		sh = new Triangle();
		sh.onDraw();
		sh.onDelete();

		sh = new Rectangle();
		sh.onDraw();
		sh.onDelete();

		sh = new Circle();
		sh.onDraw();

	}
}
