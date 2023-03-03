package assignment13;

public class Test57 {
	public static void main(String[] args) {
		ScoreTable[] s = new ScoreTable[3];
		s[0] = new ScoreTable("민들래", 5);
		s[1] = new ScoreTable("진달래", 3);
		s[2] = new ScoreTable("개나리", 0);
		
		System.out.println("이름\t점수");
		System.out.println("-----------------");
		for(ScoreTable sa : s) {
			sa.calcScore();
			sa.printView();
		}
	}
}
