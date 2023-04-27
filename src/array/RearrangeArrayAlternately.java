package array;

public class RearrangeArrayAlternately {
	public static void rearrange(long arr[], int n) {
		long temp = arr[0];
		for (int i = 0; i < n / 2; i++) {
			arr[i + 1] = temp;
			arr[2*i] = arr[n - i - 1];
			temp = arr[i + 1];

		}
		for (int i = 0; i < n; i++) {
			System.err.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		long arr[] = { 1, 2, 3, 4, 5, 6 };
		rearrange(arr, arr.length);
	}

}
