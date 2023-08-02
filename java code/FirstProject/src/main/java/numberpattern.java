
public class numberpattern {
public static void main(String[] args) {
	// Example to print a number triangle pattern
	int rows = 5;

	for (int i = 1; i <= rows; i++) {
	    for (int j = 1; j <= i; j++) {
	        System.out.print(j + " ");
	    }
	    System.out.println();
	}
	// Example to print an upside-down number pyramid pattern
	System.out.println();
	int row = 5;

	for (int i = row; i >= 1; i--) {
	    // Print spaces
	    for (int j = 1; j <= row - i; j++) {
	        System.out.print("  ");
	    }
	    // Print numbers in ascending order
	    for (int k = 1; k <= 2 * i - 1; k++) {
	        System.out.print(k + " ");
	    }
	    System.out.println();
	}


}
}
