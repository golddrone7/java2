package workshop12;

public class StringTest02 {

	public static void main(String[] args) {
		ConvertString con = new ConvertString();
		int money = (int)(Math.random()*4000000)+1000000;
		System.out.println(con.convert(money));
	}
}

