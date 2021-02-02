package assignments.assignment_2.Lab_2;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cookies that you have already eaten:");
		int cookies= sc.nextInt();
		
		System.out.println("Total calories: "+cookies*75);
		sc.close();

	}

}
