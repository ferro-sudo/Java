package day33_Constructors;

import java.util.ArrayList;

public class mouseTest {

	public static void main(String[] args) {

		int[] ints = { 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 9 };
		ArrayList<Integer> intList = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < ints.length; i++) {
			
			for (int j = 0; j < ints.length ; j++) {
				if (ints[i] == ints[j]) {
					counter++;
				}

			}
			if (!intList.contains(ints[i])) {
				intList.add(ints[i]);
				intList.add(counter);
			}

			counter = 0;
		}
		System.out.println(intList);

	}

}
