package array;

public class MaxSubarraySum {

	static long maxSubarraySum(int arr[], int n) {
		int localMax = 0;
		int globalMax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			localMax = Math.max(arr[i], localMax + arr[i]);
			globalMax = Math.max(localMax, globalMax);
		}

		return globalMax;
	}

	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.print(maxSubarraySum(arr, arr.length));
	}
}
