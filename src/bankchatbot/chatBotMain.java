package bankchatbot;

public class chatBotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String[] accountIds = {"123456", "789012", "345678"};
		        String[] passwords = {"password1", "password2", "password3"};
		        double[] balances = {1000.0, 2500.0, 500.0};

		        BalanceDisplay balanceDisplay = new BalanceDisplay();

		        System.out.println("Welcome to the Bank Chat Bot!");

		        System.out.print("Please enter your name: ");
		        String name = balanceDisplay.getUserInput();

		        boolean authenticated = balanceDisplay.authenticateUser(accountIds, passwords);

		        if (authenticated) {
		            System.out.println("Login successful. Welcome, " + name + "!");

		            // Set the balance based on the account ID
		            double balance = 0.0;

		            for (int i = 0; i < accountIds.length; i++) {
		                if (balanceDisplay.getAccountId().equals(accountIds[i])) {
		                    balance = balances[i];
		                    break;
		                }
		            }

		            balanceDisplay.setBalance(balance);

		            boolean loggedIn = true;

		            while (loggedIn) {
		                System.out.println("\nMenu:");
		                System.out.println("1. View Balance");
		                System.out.println("2. Log Off");
		                System.out.print("Enter your choice (1 or 2): ");

		                String choice = balanceDisplay.getUserInput();

		                switch (choice) {
		                    case "1":
		                        balanceDisplay.displayBalance();
		                        break;
		                    case "2":
		                        loggedIn = false;
		                        System.out.println("Logged off. Thank you for using the Bank Chat Bot!");
		                        break;
		                    default:
		                        System.out.println("Invalid choice. Please try again.");
		                        break;
		                }
		            }
		        } else {
		            System.out.println("Invalid account ID or password. Login failed.");
		        }

		        balanceDisplay.close();

	}

}
