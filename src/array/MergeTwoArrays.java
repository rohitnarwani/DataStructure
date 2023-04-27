package array;

public class MergeTwoArrays {
	public static void merge(long arr1[], long arr2[], int n, int m) {
		for (int i = 0; i < m; i++) {
			if (arr1[i] > arr2[i]) {
				arr1[i] = arr2[i];
			}
		}
	}

	public static void main(String[] args) {
		long arr1[] = { 1, 3, 5, 7 };
		long arr2[] = { 0, 2, 6, 8, 9 };
		merge(arr1, arr2, arr1.length, arr2.length);
	

	}
}
