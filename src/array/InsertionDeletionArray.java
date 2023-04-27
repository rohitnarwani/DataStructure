package array;

public class InsertionDeletionArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5 };
		int a = 2;
		int pos = 3;
		insertion(arr, a, pos);
		System.out.println();
		deletion(arr, pos);

	}

	private static void insertion(int[] arr, int a, int pos) {
		int newArr[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length + 1; i++) {
			if (i < pos - 1) {
				newArr[i] = arr[i];
			} else if (i == pos - 1) {
				newArr[i] = a;
			} else {
				newArr[i] = arr[i - 1];
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}

	}

	private static void deletion(int[] arr, int pos) {
		int newArr[] = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == pos - 1) {
				continue;
			}
			newArr[k++] = arr[i];

		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}
	}
}