package Repl;

import java.util.Arrays;

public class q133_DecimalToBinary {

	public static void main(String[] args) {
		int decimal = 35;
		int[] binary = new int[8];
		int index = 7;

		do {
			int remainder = decimal % 2;
			binary[index--] = remainder;
			decimal /= 2;

		} while (decimal > 0);
		System.out.println(Arrays.toString(binary));
	}

}
