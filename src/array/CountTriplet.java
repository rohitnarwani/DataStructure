package array;

public final class CountTriplet {
	static int countTriplet(int arr[], int n) {
		int trip = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				for (int k = j + 1; k < n; k++) {
					if (sum == arr[k]) {
						trip++;
					}
				}
			}
		}

		return trip;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2,3, 6 };
		int arr1[][]= {{1,2,7},{3,4,5}};
		System.out.println(countTriplet(arr, arr.length));
	}
}
