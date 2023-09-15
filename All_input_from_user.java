import java.util.Scanner;

public class All_input_from_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for different variable types
        System.out.print("Enter an integer: ");
        int intVariable = scanner.nextInt();

        System.out.print("Enter a float number: ");
        float floatVariable = scanner.nextFloat();

        // Consume the newline left by nextFloat() before reading the char value
        scanner.nextLine();

        System.out.print("Enter a char: ");
        char charValue = scanner.nextLine().charAt(0);

        System.out.print("Enter a string: ");
        String stringVariable = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Printing the values entered
        System.out.println("Integer: " + intVariable);
        System.out.println("Float: " + floatVariable);
        System.out.println("Char: " + charValue);
        System.out.println("String: " + stringVariable);
    }
}
