import java.util.Arrays;
import java.util.Collections;

public class ArrayDescendingOrder {
    public static void main(String[] args) {
        Integer[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Array in descending order: " + Arrays.toString(numbers));
    }
}
