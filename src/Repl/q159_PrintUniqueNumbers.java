package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class q159_PrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {

				if (nums[i] == nums[j]) {

					count++;
					// System.out.println("c"+count);
				}

			}

			if (count == 1) {

				System.out.println(nums[i]);

			}

			count = 0;
		}

	}

}
