package Repl;

import java.util.ArrayList;

public class q214_Search {

	public static String search(ArrayList<String> r, String find) {
		for (String s : r) {
			if (s.contains(find)) {
				return s;
			}
		}
		return "search failed";

	}// end wineSeller

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("2");
		arr.add("6");
		arr.add("foo bar");
		arr.add("abc");

		String find_tst = search(arr, "foo");
		System.out.print(find_tst);// foo bar

	}// end main

}
