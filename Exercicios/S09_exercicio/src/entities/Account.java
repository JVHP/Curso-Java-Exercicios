package entities;

public class Account {
	
	private String holder;
	private int account;
	private double balance;

	public Account() {
	}
	
	public Account(String holder, int account) {
		this.holder = holder;
		this.account = account;
	}
	
	public Account(String holder, int account, double initialdeposit) {
		this.holder = holder;
		this.account = account;
		deposit(initialdeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	
	public String toString() {
		return "Account " + account
				+ ", Holder: " + holder
				+ ", Balance: $ " + String.format("%.2f", balance);
	}

}
