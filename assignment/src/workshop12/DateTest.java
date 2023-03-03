package workshop12;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		ConvertDate con = new ConvertDate();
		Date date = new Date();
		System.out.println(con.convert(date, Integer.parseInt(args[0])));
	}
}
