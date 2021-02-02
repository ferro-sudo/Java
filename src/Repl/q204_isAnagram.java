package Repl;

import java.util.Arrays;

public class q204_isAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent")); // ==> true

		System.out.println(isAnagram("earth", "heart"));// ==> true

		isAnagram("star", "rats"); // ==> true

		isAnagram("hi", "bye"); // ==> false

		isAnagram("java", "cava"); // ==> false

	}

	public static boolean isAnagram(String word1, String word2) {

		char[] word1Array = word1.replace(" ", "").toLowerCase().toCharArray();
		char[] word2Array = word2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(word1Array);
		Arrays.sort(word2Array);

		return Arrays.equals(word1Array, word2Array);
	}

}
