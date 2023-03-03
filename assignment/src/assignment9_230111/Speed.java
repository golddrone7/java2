package assignment9_230111;

/*
(1)인터페이스명 : Speed
   +SPEED:int                        ==> 초기값 :  10
   +speedUp(inc:int):int          ==> 가속메서드
   +speedDown(dec:int):int     ==> 감속메서드

*/
public interface Speed {
	public int SPEED = 10;
	public int speedUp(int inc);
	public int speedDown(int dec);

}
