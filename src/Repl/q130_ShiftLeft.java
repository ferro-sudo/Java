package Repl;

import java.util.Arrays;

public class q130_ShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 6, 2, 5, 3 };

		int[] temp = new int[nums.length];

		for(int i=0;i<nums.length;i++) {
			if(i==nums.length-1) {
				temp[i]=nums[0];
			}
			else {
				temp[i]=nums[i+1];
			}
		}

		System.out.println(Arrays.toString(temp));
	}

}
