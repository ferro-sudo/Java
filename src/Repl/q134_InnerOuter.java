package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class q134_InnerOuter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE
		boolean flag = false;
		for (int j = 0; j < sizeInner; j++) {
			if (Arrays.binarySearch(outer, inner[j]) > -1) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		System.out.println(flag);

	}

}
