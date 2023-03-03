package assignment8_230111;

/*
(1)클래스명 : Shape
   -nData1:int
   -nData2:int
   +Shape(int data1, int data2)
    +getter    
    +getArea():double            ==> abstract 
*/
abstract public class Shape {
	private int nDate1;
	private int nDate2;
	
	public Shape(int data1, int data2) {
		nDate1 = data1;
		nDate2 = data2;
	}

	public int getnDate1() {
		return nDate1;
	}

	public int getnDate2() {
		return nDate2;
	}
	abstract public double getArea();
	
}
