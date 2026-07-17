package heap;

import java.util.PriorityQueue;

public class MaxToysWithSum {
	// Function to return the count of
	// maximum toys that can be bought
	public static int maxToys(int[] arr, int k) {
		int n = arr.length;

		// Create a priority_queue and push
		// all the array elements in it
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			pq.offer(arr[i]);
		}

		// To store the count of maximum
		// toys that can be bought
		int count = 0;
		while (!pq.isEmpty() && pq.peek() <= k) {
			k = k - pq.poll();
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 12, 5, 111, 200, 1000, 10 };
		int k = 50;

		System.out.println(maxToys(arr, k));
	}
}
