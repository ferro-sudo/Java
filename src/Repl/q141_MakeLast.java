package Repl;

import java.util.Arrays;

public class q141_MakeLast {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		int[] makeLast = new int[nums.length*2];
		
		makeLast[makeLast.length-1]=nums[nums.length-1];
		System.out.println(Arrays.toString(makeLast));

	}

}
