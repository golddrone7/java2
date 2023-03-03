package workshop10;

public class MonthsTest {
	public static void main(String[] args) {
		Months mon = new Months();
		int months = Integer.parseInt(args[0]);
		if(!(1<=months && months<=12)) {
			System.out.println("입력된 값이 잘못 되었습니다");
			System.exit(0);
		}
		
		System.out.println("입력받은월:"+months+"월");
		System.out.println("마지막일자:"+mon.getDays(months)+"일");
		
		/*
		입력받은월:4월
		마지막일자:30일
		*/
	}
}
