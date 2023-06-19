package bankchatbot;

public class BalanceDisplay extends UserAuthenticator {
	 private double balance;

	    public BalanceDisplay() {
	        super();
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void displayBalance() {
	        displayMessage("Account ID: " + getAccountId());
	        displayMessage("Balance: $" + balance);
	    }
}
