package array;

public class ExponentialPairs {
	public static void main(String[] args) {
		int x[] = { 2, 1, 6 };
		int y[] = { 1, 5 };

		System.out.println(countPairs(x, y, x.length, y.length));
	}

	static long countPairs(int x[], int y[], int M, int N) {
		int count = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (Math.pow(x[i], y[j]) > Math.pow(y[j], x[i])) {
					count++;
				}
			}
		}
		return count;
	}
}
