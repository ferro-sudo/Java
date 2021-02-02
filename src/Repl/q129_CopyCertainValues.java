package Repl;

import java.util.Arrays;

public class q129_CopyCertainValues {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e"))
				counter++;
		}
		String[] fewValues = new String[counter];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				fewValues[j] = arr[i];
				j++;
			}
		}

		return fewValues;
	}

}
