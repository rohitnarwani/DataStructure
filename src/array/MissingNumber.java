package array;

public class MissingNumber {
	static int missingNumber(int array[], int n) {
		int sum = n * (n + 1) / 2;
		int sumArr = 0;
		for (int i = 0; i < array.length; i++) {
			sumArr = sumArr + array[i];
		}
		return sum - sumArr;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		System.out.println(missingNumber(arr, 10));
	}
}
