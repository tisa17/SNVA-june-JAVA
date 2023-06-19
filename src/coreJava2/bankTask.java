package coreJava2;

public class bankTask {
 
	
    private String accountId;
    private String password;
    private double balance;
    private PersonalDetails personalDetails;
    
    public bankTask(String accountId, String password, double balance, PersonalDetails personalDetails) {
        this.accountId = accountId;
        this.password = password;
        this.balance = balance;
        this.personalDetails = personalDetails;
    }
    
    public String getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void viewBalance() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: $" + balance);
    }
    
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }
}
