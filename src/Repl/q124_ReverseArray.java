package Repl;

import java.util.Arrays;

public class q124_ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 3, 2, 44, 1, 100, 55};

		//TODO: write your code below
		int[] temp = new int[7];
		for(int i=0;i<nums.length;i++) {
			temp[i]=nums[nums.length-(i+1)];
		}
	    nums=temp;
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
	}

}
