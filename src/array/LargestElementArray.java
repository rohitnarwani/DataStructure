package array;

public class LargestElementArray {
	static int getlargest(int arr[], int n) {
		for (int i = 0; i < n; ++i) {
			boolean flag = true;
			for (int j = i; j < n; ++j) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				return arr[i];
			}
		}
		return -1;
	}

	static int largest(int arr[], int n) {
		int i;

		// Initialize maximum element
		int max = arr[0];

		// Traverse array elements
		// from second and compare
		// every element with current max
		for (i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args)

	{
		int arr[] = { 5, 8, 20, 15 };
		System.out.println("Largest in given array is " + largest(arr, 4));
	}
}
