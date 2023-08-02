import java.util.Arrays;
//import java.util.Collections;


public class BasicArray {
	public static void main(String[] args) {
        // Declare and initialize an array of integers
        int numbers[] = {10, 200, 90, 40, 50};

        // Access and print elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

       // Calculate and print the sum of the array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the array elements: " + sum);

        // Find the maximum element in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
        
     // Find the minimum element in the array
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + min);
        
       System.out.println("Original array: " + Arrays.toString(numbers));

        //Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
      // Sort the array in descending order
        //Arrays.sort(numbers, Collections.reverseOrder());

        //System.out.println("Array in descending order: " + Arrays.toString(numbers));
        
    }
    }
