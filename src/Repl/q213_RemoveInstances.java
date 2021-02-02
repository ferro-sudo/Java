package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class q213_RemoveInstances {

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
		ArrayList<Integer> newList= new ArrayList<>();
		newList.add(n);
		r.removeAll(newList);
		return r;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3 };
		arr.addAll(Arrays.asList(nums));

		System.out.print(removeInst(arr, 1));

	}// end main

}
