//Java code for user give 3 number and find the highest no
import java.util.Scanner;

public class AssModule1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        // Close the Scanner after reading the input
        //scanner.close();

        // Find the highest number among the three using conditional statements
        int highestNumber = firstNumber;
        if (secondNumber > highestNumber) {
            highestNumber = secondNumber;
        }
        if (thirdNumber > highestNumber) {
            highestNumber = thirdNumber;
        }

        // Print the highest number
        System.out.println("The highest number is: " + highestNumber);
        
     // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNo = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNo = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int thirdNo = scanner.nextInt();

        // Close the Scanner after reading the input
        scanner.close();

        // Find the highest number among the three
        int highestNo = Math.max(firstNo, Math.max(secondNo, thirdNo));

        // Print the highest number
        System.out.println("The highest number is: " + highestNo);
    }
}

