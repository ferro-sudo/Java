package UtilityMethots;


import java.util.ArrayList;
import java.util.Arrays;

class valueOf {

	public static void main(String[] args) {
		String[] words = { "hi", "hello", "java", "world", "125" };
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
		System.out.println(words(wordList));
	}

	protected static Integer words(ArrayList<String> arr) {
		
		arr.get(0);
		Integer s = Integer.parseInt(arr.get(4));
		int inter = s.intValue();
		return inter;
	}

}
