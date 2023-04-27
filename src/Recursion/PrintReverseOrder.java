package Recursion;

public class PrintReverseOrder {

	// Time Complexity: O(N)
	// Auxiliary Space: O(1)
	static void printReverseOrder(int N) {

		for (int i = N; i > 0; i--)
			System.out.print(+i + " ");
	}

	// Time Complexity: O(N)
	// Auxiliary Space: O(N)
	static void printReverseOrderRecursion(int N) {

		// If N is less than 1 then
		// return static void function
		if (N <= 0) {
			return;
		} else {
			System.out.print(N + " ");

			// Recursive call of the function
			printReverseOrderRecursion(N - 1);
		}
	}

	static void printNos(int n) {
		if (n > 0) {
			printNos(n - 1);
			System.out.print(n + " ");
		}
		return;
	}

	public static void main(String[] args) {
		int N = 5;

		printReverseOrder(N);
		System.out.println();
		printNos(7);
	}
}
