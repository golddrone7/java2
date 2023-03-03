package assignment12;

public class Harrypotter {
	private int num;
	private String firstname;
	private String lastname;
	
	public Harrypotter() {
		// TODO Auto-generated constructor stub
	}

	public Harrypotter(int num, String firstname, String lastname) {
		super();
		this.num = num;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return num+"\t"+firstname+"\t" +lastname;
	}

	public int getNum() {
		return num;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	
	
	
}
