package array;

import java.util.ArrayList;

public class MaxSubArraySum1 {

	private static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> ls = new ArrayList<>();
		int count = 0;
		for (int j = 0; j < n; j++) {
			count = arr[j];
			for (int i = j + 1; i <= n; i++) {
				if (count == s) {
					ls.add(j + 1);
					ls.add(i);
					return ls;
				}
				if (count > s || i == n) {
					break;
				}

				count += arr[i];

			}

		}
		if (ls.isEmpty()) {
			ls.add(-1);
		}
		return ls;

	}

	public static void main(String[] args) {
		int A[] = { 95, 104, 12, 123, 134 };
		int b[] = { 1, 2, 3, 7, 5 };
		int sum = 12;
		System.out.println(subarraySum(b, b.length, sum));
	}
}
