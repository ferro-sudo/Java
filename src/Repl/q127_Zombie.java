package Repl;

import java.util.Arrays;

public class q127_Zombie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 1 };

		int i = 0;
		for (i = 0; i < inhabitants.length; i++) {
			System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
			for (int j = 0; j < inhabitants.length; j++) {
				inhabitants[j] = inhabitants[j] / 2;
			}

			if (Arrays.equals(inhabitants, new int[8]))
				break;
		}

		System.out.println("Day " + (i + 1) + " " + Arrays.toString(inhabitants));
		System.out.println("---- EXTINCT ----");

	}

}
