package Repl;

import java.util.Arrays;

public class q173_LargestNumber {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 5, 33, 9 } };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j])
					max = arr[i][j];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = max;
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
