package workshop10;

public class Months {
	int getDays(int months) {
		return months==2 ? 28 : (months==4||months==6||months==9||months==11 ? 30 : 31) ;
	}
}
