package coreJava2;

import java.util.Scanner;

public class bankTaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonalDetails[] personalDetailsArray = {
                new PersonalDetails("John Smith", "123", "Main St", "New York", "10001", "1234567890", "9876543210"),
                new PersonalDetails("Jane Doe", "456", "Elm St", "Los Angeles", "90001", "9876543210","1152248777"),
                new PersonalDetails("Zim Dane","789","Rain st", "Houston", "70808 ","7894561230","9887451254")		
        };
		bankTask[] bankAccounts = {
                new bankTask("123456", "password1", 1000.0, personalDetailsArray[0]),
                new bankTask("789012", "password2", 2500.0, personalDetailsArray[1]),
                new bankTask("345678", "password3", 500.0, personalDetailsArray[2])        
		};
		
		boolean online=true;
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Bank Chat Bot!");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        while(online) {
        	
        System.out.print("Please enter your bank account ID: ");
        
        String accountId = scanner.nextLine();
        scanner.nextLine();
      
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        bankTask currentAccount = null;

        for (bankTask account : bankAccounts) {
            if (account.getAccountId().equals(accountId) && account.getPassword().equals(password)) {
                currentAccount = account;
                break;
            }
        }

        if (currentAccount != null) {
            System.out.println("Login successful. Welcome, " + name + "!");
            boolean loggedIn = true;
            currentAccount.getPersonalDetails().displayDetails();

            while (loggedIn) {
                System.out.println("\nMenu:");
                System.out.println("1. View Balance");
                System.out.println("2. Log Off");
                System.out.print("Enter your choice (1 or 2): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        currentAccount.viewBalance();
                        break;
                    case 2:
                        loggedIn = false;
                        System.out.println("/n Logged out!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
          
           System.out.println("\n Would you like to Sign into another account ");
           System.out.println("1. yes");
           System.out.println("2. no");
           System.out.print("Enter your choice (1 or 2): ");
           int choice2=scanner.nextInt();
            switch (choice2) {
            case 1:
                break;
            case 2:
                online = false;
                System.out.println("Have a good day. Thank you for using Bank Chat Bot");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            
            }
            
            scanner.reset();
        } else {
            System.out.println("Invalid account ID or password. Login failed.");
        }
        
		}
        
	}


}
