package workshop12;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		System.out.println("계좌정보: " + acc.getAccount() + " " + acc.getBalance() + " "+acc.getInterestRate());
		try {
			acc.deposit(-10);
			acc.withdraw(600000);
			System.out.println("이자: " + acc.calculateInterest());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
