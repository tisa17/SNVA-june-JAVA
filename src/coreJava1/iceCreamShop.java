package coreJava1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iceCreamShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        boolean buying = true;
	        int orderNumber = 1;
	        String[] flavors = new String[100];
	        double[] prices = new double[100];
	        int[] quantities = new int[100];
	        double totalPrice = 0.0;
	        int totalQuantity = 0;
	        int itemCount = 0;

	        System.out.println("********************************************");
	        System.out.println("*******Welcome to the Ice Cream Shop!*******");
	        System.out.println("********************************************");

	        while (buying) {
	            System.out.println("\nWhat category would you like to buy from?");
	            System.out.println("1. Scoops");
	            System.out.println("2. Exquisite");
	            System.out.print("Enter your choice (1 or 2): ");

	            int category = scanner.nextInt();

	            switch (category) {
	                case 1:
	                    System.out.println("\nScoop Menu:");
	                    System.out.println("1. Vanilla - Price: $150.00");
	                    System.out.println("2. Chocolate - Price: $200.00");
	                    System.out.println("3. Buttercream - Price: $100.00");
	                    break;
	                case 2:
	                    System.out.println("\nExquisite Menu:");
	                    System.out.println("1. DBC - Price: $300.00");
	                    System.out.println("2. Mango - Price: $250.00");
	                    break;
	                default:
	                    System.out.println("Invalid category choice.");
	                    continue;
	            }

	            System.out.print("Enter your flavor choice: ");
	            int flavor = scanner.nextInt();

	            System.out.print("How many would you like? ");
	            int quantity = scanner.nextInt();

	            double price = 0.0;
	            String flavorName = "";

	            switch (category) {
	                case 1:
	                    switch (flavor) {
	                        case 1:
	                            flavorName = "Vanilla";
	                            price = 150.00;
	                            break;
	                        case 2:
	                            flavorName = "Chocolate";
	                            price = 200.00;
	                            break;
	                        case 3:
	                            flavorName = "Buttercream";
	                            price = 100.00;
	                            break;
	                    }
	                    break;
	                case 2:
	                    switch (flavor) {
	                        case 1:
	                            flavorName = "DBC";
	                            price = 300.00;
	                            break;
	                        case 2:
	                            flavorName = "Mango";
	                            price = 250.00;
	                            break;
	                    }
	                    break;
	            }

	            flavors[itemCount] = flavorName;
	            prices[itemCount] = price;
	            quantities[itemCount] = quantity;
	            itemCount++;

	            totalPrice += price * quantity;
	            totalQuantity += quantity;
	            
	            System.out.println("\n----------------YOUR RECIEPT------------------");
		        System.out.println("\n----------------------------------------------");
		        System.out.println("Sl. no   flavor      price   quantity   amount");
		        System.out.println("------------------------------------------------");
		        for (int i = 0; i < itemCount; i++) {
		            String rFlavor = flavors[i];
		            double rrice = prices[i];
		            int tQuantity = quantities[i];
		            double amount = price * quantity;

		            System.out.printf("%-9d %-11s $%-7.2f %-10d $%.2f%n", i + 1, flavor, price, quantity, amount);
		        }
		        System.out.println("------------------------------------------------");
		        System.out.printf("Your total amount is        %-9d    $%.2f%n", totalQuantity, totalPrice);
		        System.out.println("------------------------------------------------");


	            System.out.print("\nWould you like to buy more? (yes/no): ");
	            String continueChoice = scanner.next();

	            if (continueChoice.equalsIgnoreCase("no")) {
	                buying = false;
	            }
	        }
	        System.out.println("\n----------------YOUR RECIEPT------------------");
	        System.out.println("\n----------------------------------------------");
	        System.out.println("Sl. no   flavor      price   quantity   amount");
	        System.out.println("------------------------------------------------");
	        for (int i = 0; i < itemCount; i++) {
	            String flavor = flavors[i];
	            double price = prices[i];
	            int quantity = quantities[i];
	            double amount = price * quantity;

	            System.out.printf("%-9d %-11s $%-7.2f %-10d $%.2f%n", i + 1, flavor, price, quantity, amount);
	        }
	        System.out.println("------------------------------------------------");
	        System.out.printf("Your total amount is        %-9d    $%.2f%n", totalQuantity, totalPrice);
	        System.out.println("------------------------------------------------");

	        System.out.println("Thank you for visiting the Ice Cream Shop! Enjoy your ice cream!");
	        scanner.close();
	   	} 

}
