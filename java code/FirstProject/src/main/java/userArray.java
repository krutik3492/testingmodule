import java.util.Scanner;
import java.util.Arrays;

public class userArray {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of integers with the given size
        int numbers[] = new int[size];

        // Input array elements from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Find the minimum and maximum elements in the array
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        scanner.close();
    }

}
