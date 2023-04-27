package array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class LeadersInArray {
	static ArrayList<Integer> leaders(int arr[], int n) {
		Deque<Integer> sk = new ArrayDeque<>();
		sk.push(arr[n - 1]);
		int max = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] <= arr[i - 1] && arr[i - 1] >= max) {
				sk.push(arr[i - 1]);
				max = arr[i - 1];
			}
		}
		return new ArrayList<>(sk);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 0 };
		System.out.println(leaders(arr, arr.length).toString());
	}
}
