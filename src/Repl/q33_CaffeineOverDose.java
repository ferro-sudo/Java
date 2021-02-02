package Repl;

import java.util.Scanner;

public class q33_CaffeineOverDose {

	public static void main(String[] args) {
		
		System.out.println("Enter numbers of milligrams in drink:");
		int numOfMilligrams = new Scanner(System.in).nextInt();
		int lethalOverDose = 10000;
		
		int dosesToKill= lethalOverDose/numOfMilligrams;
		
		System.out.println("Number of miligrams in drink: "+numOfMilligrams);
		System.out.println("It would take about "+dosesToKill+" drinks for a lethal overdose.");

	}

}
