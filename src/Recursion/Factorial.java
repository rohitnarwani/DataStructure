package Recursion;

public class Factorial {

	public static void main(String[] args) {

	}

	int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	// A tail-recursive function to calculate the factorial of a number
	int factorial(int n, int result) {
		if (n == 0)
			return result;
		else
			return factorial(n - 1, result * n);
	}

	// A non-tail-recursive function to calculate the nth Fibonacci number

	int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
