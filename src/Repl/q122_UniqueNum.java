package Repl;

public class q122_UniqueNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 2, 3, 4, 3, 4 };

		int count = 0;

		for (int i :nums) {

			for (int j : nums) {

				if (i == j) {

					count++;

				}

			}

			if (count == 1) {

				System.out.println(nums[i]);

			}

			count = 0;
		}

	}

}
