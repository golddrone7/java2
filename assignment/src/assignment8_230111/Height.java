package assignment8_230111;

/*
(1)추상클래스:  Height 
   +INCH:double                              ==> final변수, 초기값:2.54 
   +getInch(double cm):double          ==> 추상메서드
*/
abstract public class Height {
	public final double INCH = 2.54;
	abstract public double getInch(double cm);
}
