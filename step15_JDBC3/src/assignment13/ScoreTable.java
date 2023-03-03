package assignment13;

public class ScoreTable {
	private String name;
	private int sol;
	private final int s = 20;
	private int score;
	
	public ScoreTable() {
	
	}

	public ScoreTable(String name, int sol) {
		super();
		this.name = name;
		this.sol = sol;
	}
	
	public void calcScore() {
		score = s*sol;
	}
	public void printView() {
		System.out.println(name+"\t"+score);
	}
	
}
