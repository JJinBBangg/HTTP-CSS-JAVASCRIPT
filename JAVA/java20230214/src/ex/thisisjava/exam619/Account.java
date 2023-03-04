package ex.thisisjava.exam619;

public class Account {
//	final static MIN_BALANCE;
//	final static MAX_BALANCE;

	private int Balance = 0;

	public void setBalance(int balance) {
		if (balance < 0) {
			return;
		}
		this.Balance = balance;
	}

	public int getBalance() {
		return Balance;
	}

}
