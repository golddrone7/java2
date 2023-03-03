package assignment10;

/*
(2)인터페이스명 : Score
   +num:int (초기값: 10)
   +scoreResult(sol:int):void //점수를 계산해서 출력(sol*num)

*/
public interface Score {
	public int num = 10;
	public void scoreResult(int sol);
}
