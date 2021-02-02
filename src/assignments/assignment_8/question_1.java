package assignments.assignment_8;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {

		plus();

	}
	
	public static void plus() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		int result= num1+num2;
		System.out.println("result: "+result);
		scan.close();
	}

}
