package workshop06;

public class AccountTest {

	public static void main(String[] args) {
		Account ac = new Account("441-0290-1203", 0, 0.073);
		System.out.println("계좌정보:"+ac.getAccount() + " 현재잔액: " + ac.getBalance() );
		ac.withdraw(60000);
		ac.setBalance(500000);
		ac.deposit(20000);
		System.out.println("계좌정보:"+ac.getAccount() + " 현재잔액: " + ac.getBalance() );
		System.out.printf("이자:%.1f\n" , ac.calculateInterest());
		
	}

}
