package greedy;

import java.util.Arrays;

public class JobSequencingProblem implements Comparable<JobSequencingProblem> {
	char id; // Job Id
	int dead; // Deadline of job

	// Profit if job is over
	// before or on deadline
	int profit;

	JobSequencingProblem(char id, int dead, int profit) {
		this.id = id;
		this.dead = dead;
		this.profit = profit;
	}

	// This function is used for sorting all
	// jobs according to decreasing order of profit
	@Override
	public int compareTo(JobSequencingProblem o) {
		if (this.profit < o.profit)
			return 1;
		return -1;
	}
};

class GFG {
	// Returns minimum number of platforms reqquired
	static void printJobScheduling(JobSequencingProblem arr[], int n) {
		// Sort all jobs according to
		// decreasing order of prfit
		Arrays.sort(arr);

		// To store result (Sequence of jobs)
		int result[] = new int[n];
		// To keep track of free time slots
		boolean slot[] = new boolean[n];

		// Initialize all slots to be free
		for (int i = 0; i < n; i++)
			slot[i] = false;

		// Iterate through all given jobs
		for (int i = 0; i < n; i++) {
			// Find a free slot for this job
			// (Note that we start
			// from the last possible slot)
			for (int j = Math.min(n, arr[i].dead) - 1; j >= 0; j--) {
				// Free slot found
				if (slot[j] == false) {
					result[j] = i; // Add this job to result
					slot[j] = true; // Make this slot occupied
					break;
				}
			}
		}

		// Print the result
		for (int i = 0; i < n; i++)
			if (slot[i])
				System.out.print(arr[result[i]].id + " ");
	}

	public static void main(String args[]) {
		JobSequencingProblem arr[] = { new JobSequencingProblem('a', 2, 100), new JobSequencingProblem('b', 1, 19),
				new JobSequencingProblem('c', 2, 27), new JobSequencingProblem('d', 1, 25),
				new JobSequencingProblem('e', 3, 15) };

		int n = arr.length;

		System.out.print("Following is maximum profit" + " sequence of job : ");

		printJobScheduling(arr, n);
	}

}
