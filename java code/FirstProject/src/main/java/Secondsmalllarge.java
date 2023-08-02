//Find the second smallest and second largest elements in an array:
import java.util.Arrays;
import java.util.Scanner;
public class Secondsmalllarge {
	public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        int secondSmallest = numbers[1];
        int secondLargest = numbers[numbers.length - 2];

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
       
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of integers with the given size
        int number[] = new int[size];

        // Input array elements from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        
        System.out.println("Original array: " + Arrays.toString(number));

        Arrays.sort(number);

        int secondSmall = number[1];
        int secondLarge = number[number.length - 2];

        System.out.println("Second Smallest: " + secondSmall);
        System.out.println("Second Largest: " + secondLarge);

        
    }
}
