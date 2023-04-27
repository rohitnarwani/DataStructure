package matrix;

public class MatrixRotation {
	static void rotateMatrix(int mat[][], int N) {
		// Consider all squares one by one
		for (int i = 0; i < N / 2; i++) {
			// Consider elements in group of 4 in
			// current square
			for (int j = i; j < N - i - 1; j++) {
				// store current cell in temp variable
				int temp = mat[i][j];

				// move values from right to top
				mat[i][j] = mat[j][N - 1 - i];

				// move values from bottom to right
				mat[j][N - 1 - i] = mat[N - 1 - i][N - 1 - j];

				// move values from left to bottom
				mat[N - 1 - i][N - 1 - j] = mat[N - 1 - j][i];

				// assign temp to left
				mat[N - 1 - j][i] = temp;
			}
		}

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = 3;
		System.out.println("Original Matrix:");
		printMatrix(matrix, n);
		rotateMatrix(matrix, n);
		System.out.println("Matrix rotated by 90 degrees clockwise:");
		printMatrix(matrix, n);
	}

	public static void printMatrix(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
