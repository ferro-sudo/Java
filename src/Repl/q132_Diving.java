package Repl;

import java.util.Scanner;

public class q132_Diving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		// WRITE YOUR CODE HERE
		float sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("Enter score for judge " + (i + 1) + ":");
			score[i] = input.nextFloat();
		}
		System.out.println("Enter difficulty:");
		float difficulty = input.nextFloat();
		float max = 0;
		float min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}
		for (int i = 0; i < score.length; i++)
			if (max != score[i] && min != score[i])
				sum += score[i];

		float total = sum * difficulty * 0.6f;
		// FINAL OUTPUT
		System.out.printf("Total: %.2f", total);

	}

}
