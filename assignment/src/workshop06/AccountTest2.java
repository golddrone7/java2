package workshop06;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] ac = new Account[5];
		for(int i=0; i<ac.length; i++) {
			ac[i] = new Account("221-0101-211" + (i + 1), 100000, 0.045);
		}
		
		for(Account a : ac) {
			a.accountInfo();
			System.out.println();
		}
		System.out.println();
		
		for(Account a : ac) {
			a.setInterestRate(0.037);
			a.accountInfo();
			System.out.println(" 이자:" + (int)a.calculateInterest() +"원");
		}
		
		
		
	}

}
