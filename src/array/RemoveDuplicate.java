package array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		n = removeDups(arr, arr.length);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static int removeDups(int arr[], int n) {
		int temp[] = new int[n];
		temp[0] = arr[0];
		int res = 1;
		for (int i = 1; i < n; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];
		}
		return res;
	}
}
