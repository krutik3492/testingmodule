
public class starpattern {
	public static void main(String[] args) {
		// Example to print a right-angled triangle pattern
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		// Example to print an inverted right-angled triangle pattern
		System.out.println();
		int row = 5;

		for (int i = row; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		// Example to print a pyramid pattern
		System.out.println();
		int rows1 = 5;

		for (int i = 1; i <= rows1; i++) {
		    // Print spaces
		    for (int j = 1; j <= rows1 - i; j++) {
		        System.out.print("  ");
		    }
		    // Print stars
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		// Example to print a diamond pattern
		System.out.println();
		int rows2 = 5;
		int spaces = rows2 - 1;

		for (int i = 1; i <= rows2; i++) {
		    // Print spaces
		    for (int j = 1; j <= spaces; j++) {
		        System.out.print(" ");
		    }
		    // Print stars
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		    spaces--;
		}

		spaces = 1;

		for (int i = 1; i <= rows2 - 1; i++) {
		    // Print spaces
		    for (int j = 1; j <= spaces; j++) {
		        System.out.print(" ");
		    }
		    // Print stars
		    for (int k = 1; k <= 2 * (rows2 - i) - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		    spaces++;
		}
}

}
