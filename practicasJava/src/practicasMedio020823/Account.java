package practicasMedio020823;

public class Account {

	double balance = 0;
	String accountNumber = "";

	public Account(String accountNumber, double balance) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}

	public void addMoney(double money) {
		this.balance = balance + money;		
	}
	
	public void withdrawMoney(double money) {
		this.balance = balance - money;		
	}
	
	
}
