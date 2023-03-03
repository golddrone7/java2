package workshop12;

public class Account {
	private String account;	//계좌
	private double balance;	// 잔액
	private double interestRate; // 이율
	
	public Account() {
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		// 이자 계산 : 현재잔고 x 이자율
		return balance*interestRate/100;
	}
	
	public void deposit(double money) throws Exception {
		// 입금 처리 및 예외상황 처리
		if(money<0)
			throw new Exception("입금 금액이 0보다 적습니다.");
		balance+=money;
		
	}
	
	public void withdraw(double money) throws Exception {
		// 출금 처리 및 예외상황 처리
		if(money<0 || balance<money) {
			throw new Exception("출금 금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		balance-=money;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
