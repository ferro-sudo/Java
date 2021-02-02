package assignments.assignment_2.Lab_2;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of a purchase:");
		double purchase= sc.nextInt();
		
		System.out.println("The amount of the purchase is "+purchase+",\n"
							+ " the state sales tax is "+purchase*0.04+",\n"
							+ " the county sales tax is "+purchase*0.02+",\n"
							+ " the total sales tax is "+purchase*0.06+"\n"
							+ " and the total of the sale is "+purchase*1.06);
		sc.close();

	}

}
