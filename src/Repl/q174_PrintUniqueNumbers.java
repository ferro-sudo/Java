package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class q174_PrintUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 5, 5, 6, 3, 6, 9, 34, 3 };

		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					counter++;
				}
			}
			if (counter == 1) {
				System.out.println(nums[i]);
			}
			counter=0;
		}
		

	}

}
