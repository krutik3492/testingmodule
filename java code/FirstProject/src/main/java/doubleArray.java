

	import java.util.Scanner;
	public class doubleArray {
			public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Declare an array of doubles with the given size
	        double numbers[] = new double[size];

	        // Input array elements from the user
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextDouble();
	        }

	        // Print the array elements
	        System.out.println("Elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println();

	        // Calculate the sum and average of the array elements
	        double sum = 0;
	        for (int i = 0; i < size; i++) {
	            sum += numbers[i];
	        }
	        double average = sum / size;

	        System.out.println("Sum of the array elements: " + sum);
	        System.out.println("Average of the array elements: " + average);

	        scanner.close();
	    }
	}

