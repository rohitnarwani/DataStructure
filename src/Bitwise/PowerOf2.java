package Bitwise;

public class PowerOf2 {

	/* Function to check if x is power of 2 */
	public static boolean isPowerofTwo(long n) {
		return (n != 0) && ((n & (n - 1)) == 0);
	}

	// Driver Code
	public static void main(String[] args) {
		// Function call
		if (isPowerofTwo(7))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (isPowerofTwo(64))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
