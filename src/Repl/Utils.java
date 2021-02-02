package Repl;

public class Utils {
	public static String reverseLetters(String word) {

		char[] str = word.toCharArray();

		int r = str.length - 1, l = 0;

		// Traverse string from both ends until
		// 'l'(left) and 'r'(right)
		while (l < r) {
			// Ignore special characters
			if (!Character.isAlphabetic(str[l]))
				l++;
			else if (!Character.isAlphabetic(str[r]))
				r--;

			// Both str[l] and str[r] are not spacial
			else {
				char tmp = str[l];
				str[l] = str[r];
				str[r] = tmp;
				l++;
				r--;
			}

		}
		word = "";
		for (int i = 0; i < str.length; i++) {
			word += str[i];
		}

		return word;
	}
}
