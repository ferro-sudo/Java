package assignments.assignment_4;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		String riskFactor = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Your body weight:");
		int weight = scan.nextInt();
		System.out.println("Your height in Feet :");
		int heightFeet = scan.nextInt();
		System.out.println("Your height in inches:");
		int heightInch = scan.nextInt();
		scan.close();

		double weightKilograms = weight / 2.2;
		double heightMeters = (heightFeet * 12 + heightInch) * 0.0254;
		double BMI = weightKilograms / (heightMeters * heightMeters);
		if (BMI < 18.5) {
			riskFactor = "Underweight";
		} else if (BMI >= 18.5 && BMI < 25) {
			riskFactor = "Normal Weight";
		} else if (BMI >= 25 && BMI < 30) {
			riskFactor = "Overweight";
		} else {
			riskFactor = "Obese";
		}

		System.out.println("Your weight in pounds: " + weight);
		System.out.println("Your height in feet followed by space then inches: " + heightFeet + " " + heightInch);
		System.out.println("Your BMI is " + BMI);
		System.out.println("Your risk factor is " + riskFactor);

	}

}
