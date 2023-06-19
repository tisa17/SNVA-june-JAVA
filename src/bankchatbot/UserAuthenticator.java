package bankchatbot;

public class UserAuthenticator extends chatBot {
	private String accountId;
    private String password;

    public UserAuthenticator() {
        super();
    }

    public boolean authenticateUser(String[] accountIds, String[] passwords) {
        displayMessage("Please enter your bank account ID: ");
        accountId = getUserInput();

        displayMessage("Please enter your password: ");
        password = getUserInput();

        for (int i = 0; i < accountIds.length; i++) {
            if (accountId.equals(accountIds[i]) && password.equals(passwords[i])) {
                return true;
            }
        }

        return false;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }

}
