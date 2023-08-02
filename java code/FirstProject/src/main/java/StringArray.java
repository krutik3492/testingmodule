

	import java.util.Scanner;
	public class StringArray {
			public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline left by nextInt()

	        // Declare an array of strings with the given size
	        String[] words = new String[size];

	        // Input array elements from the user
	        System.out.println("Enter " + size + " words:");
	        for (int i = 0; i < size; i++) {
	            words[i] = scanner.nextLine();
	        }

	        // Print the array elements
	        System.out.println("Elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(words[i] + " ");
	        }
	        System.out.println();

	        // Search for a specific word in the array
	        System.out.print("Enter the word to search: ");
	        String searchWord = scanner.nextLine();

	        int occurrences = 0;
	        for (int i = 0; i < size; i++) {
	            if (words[i].equalsIgnoreCase(searchWord)) {
	                occurrences++;
	            }
	        }

	        System.out.println("The word '" + searchWord + "' appears " + occurrences + " times in the array.");

	        scanner.close();
	    }
	}



