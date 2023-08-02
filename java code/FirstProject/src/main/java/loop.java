//loops in Java
public class loop {
	/*for (initialization; condition; update) {
	    // Code to be executed repeatedly
	}*/
	public static void main(String[] args) {
		// Example of a for loop that prints the numbers from 1 to 5
		System.out.println("for loop");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		// Example of a while loop that prints the numbers from 1 to 5
		int j = 1;
		System.out.println("while loop");
		while (j <= 5) {
			System.out.println(j);
		    j++;
		}
		// Example of a do-while loop that prints the numbers from 1 to 5
		System.out.println("do while loop");
		int k = 1;
		do {
		    System.out.println(k);
		    k++;
		} while (k <= 5);
	}
}
