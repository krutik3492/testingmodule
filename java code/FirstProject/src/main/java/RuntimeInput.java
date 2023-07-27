import java.util.Scanner;

public class RuntimeInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value
        System.out.print("Enter a No1: ");

        // Read the input value
        int No1 = scanner.nextInt();
        
        System.out.print("Enter a No2: ");

        int No2 = scanner.nextInt();
        
        int No3=No1+No2;

        // Close the Scanner after reading the input
        scanner.close();

        // Process the value (for demonstration, we'll just print it)
        System.out.println("Your answer is: " + No3);
    }
}

