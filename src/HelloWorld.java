
public class HelloWorld {
	int a = 10;
	float b = 10.2f;
	double d = 10.2d;

	char e = 's';

	boolean x = false;



	public static void main(String[] args) {
		// System.out.println("Hello World");
		String name = "Hello";
		String t = new String("Hello");
		name = name.concat(" world");
		t.charAt(2);
		int age = 18;
		if (age >= 18) {
			System.out.println("elgible for voting");
		}

		int no = 5;
		if (no % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		int marks = 50;
		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 60) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade C");
		}

		/*
		 * for (int i = 1; i < 5; i++) { System.out.println(i); }
		 * 
		 * for (int i = 1; i <= 3; i++) { for (int j = 1; j <= 2; j++) {
		 * System.out.println(i + " " + j); }
		 * 
		 * }
		 */

		/*
		 * int num[] = { 10, 20, 30 };
		 * 
		 * for (int i = 0; i <= 2; i++) { System.out.println(num[i]); } // Enhance For
		 * loop (For-Each) for (int n : num) { System.out.println(n); }
		 */
		int i = 10;
		/*
		 * while (i <= 5) { i++; System.out.println(i);
		 * 
		 * }
		 */

		do {
			System.out.println(i);

		} while (i < 5);
	}

}
