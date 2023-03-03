package workshop12;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConvertString {
	public String convert(int money) {
		NumberFormat format = NumberFormat.getNumberInstance();
		return format.format(money)+"원";
	}
}
