package bankchatbot;

import java.util.Scanner;

public class chatBot {
	protected Scanner scanner;

    public chatBot() {
        scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
	

}
