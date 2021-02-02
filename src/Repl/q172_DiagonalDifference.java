package Repl;

public class q172_DiagonalDifference {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };

		int result = 0;
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		for (int i = 0; i < matrix.length; i++) {

			leftDiagonal += matrix[i][i];

			rightDiagonal += matrix[i][2 - i];
		}

		result = leftDiagonal - rightDiagonal;

		// FINAL PRINT
		System.out.println(Math.abs(result));

	}

}
