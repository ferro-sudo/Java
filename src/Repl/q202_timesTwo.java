package Repl;

import java.util.ArrayList;

public class q202_timesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void timesTwo(ArrayList<Integer> nums) {
		for (int i=0;i<nums.size();i++) {
			nums.set(i, nums.get(i) * 2);
		}
	}

}
