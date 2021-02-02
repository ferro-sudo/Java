package Repl;

import java.util.ArrayList;

public class q201_AppendPosSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> ints) {
		ArrayList<Integer> withSum = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < ints.size(); i++) {
			if (ints.get(i) > 0) {
				withSum.add(ints.get(i));
				sum += ints.get(i);
			}
		}
		withSum.add(sum);
		return withSum;

	}

}
