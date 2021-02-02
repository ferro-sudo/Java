package assignments.assignment_2.Lab_2;

import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charge for the meal:");
		double charge= sc.nextInt();
		
		System.out.println("Meal charge is "+charge+"$, tax amount is "+charge*0.0675+"$, tip amount is "+charge*0.2+"$ and total bill is "+charge*1.2675+"$");
		sc.close();
	}

}
