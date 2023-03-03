package assignMent;

/*
[문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.
money = 65430원
만원 = 6
천원 = 5
백원 = 4
십원 = 3
*/





public class Java2 {

	public static void main(String[] args) {
		String money = "65430";
		int intMoney = Integer.parseInt(money);
		System.out.println("만원 = "+ intMoney / 10000);
		intMoney %= 10000;
		System.out.println("천원 = " + intMoney/1000);
		intMoney %= 1000;
		System.out.println("백원 = " + intMoney/100);
		intMoney %= 100;
		System.out.println("십원 = " + intMoney/10);
	}

}
