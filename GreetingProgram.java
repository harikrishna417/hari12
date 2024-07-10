import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to the Java program.");

        // Close the scanner
        scanner.close();
    }
}
