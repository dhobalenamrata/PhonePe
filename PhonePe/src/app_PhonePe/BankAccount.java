package app_PhonePe;

public class BankAccount {
	private double balance;
	private String accNo;
	public BankAccount(String accNo, double balance) {
		this.balance = balance;
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
}
