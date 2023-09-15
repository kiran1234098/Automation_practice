import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Please enter your name: ");

        // Read the input provided by the user
        String userName = scanner.nextLine();

        // Close the Scanner since we don't need it anymore
        scanner.close();

        // Print the input along with a message
        System.out.println("Hello, " + userName + "! Welcome to the program.");
    }
}

