package array;

import java.util.ArrayList;

public class SubArray {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> ls = new ArrayList<>();
		int sum = arr[0], start = 0;
		for (int i = 1; i <= n; i++) {
			while (sum > s && start < i) {
				sum = sum - arr[start];
				start++;
			}
			if (sum == s) {
				ls.add(start + 1);
				ls.add(i);
				return ls;
			}
			if (i < n) {
				sum = sum + arr[i];
			}
		}
		ls.add(-1);
		return ls;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 5 };
		subarraySum(arr, arr.length, 12).forEach(System.out::print);
	}
}
