package Repl;

import java.util.Arrays;

public class q126_SplitPrintShortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "volt, olive, fish, hot pursuit, warning, python, java, coffee, part";
		String[] words = str.split(", ");
		int counter = 0;
		String min = words[0];
		for (int i = 0; i < words.length; i++) {
			if (min.length() > words[i].length()) {
				min = words[i];
			}
		}
		for (int i = 0; i < words.length; i++) {
			if (min.length() == words[i].length()) {
				counter++;
			}
		}
		String[] tempArr = new String[counter];
		for (int i = 0, j = 0; i < words.length; i++) {
			if (min.length() == words[i].length()) {
				tempArr[j] = words[i];
				j++;

			}
		}
		System.out.println(Arrays.toString(tempArr));
	}

}
