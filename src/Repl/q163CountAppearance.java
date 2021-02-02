package Repl;

public class q163CountAppearance {

	public static void main(String[] args) {

		String[] some_array = { "a", "foo", "bar", "foo", "bla" };

		String some_string = "foo";

		System.out.println(count_appearance(some_array, some_string));

	}

	public static int count_appearance(String[] arr, String t) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(t)) {
				counter++;
			}

		}

		return counter;
	}

}
