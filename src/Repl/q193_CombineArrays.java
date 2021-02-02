package Repl;

import java.util.ArrayList;

public class q193_CombineArrays {

	public static void main(String[] args) {
		String[] str1 = { "f", "o", "o" };
		String[] str2 = { " b", "a", "r" };
		System.out.println(combineRs(str1, str2));

	}

	public static String combineRs(String[] r1, String[] r2) {
		ArrayList<String> combineStr = new ArrayList<>();
		String temp1 = "";
		for (String s : r1) {
			temp1 += s;
		}
		for (String s : r2) {
			temp1 += s;
		}
		combineStr.add(temp1);

		String combined = combineStr.get(0);
		return combined;
	}

}
