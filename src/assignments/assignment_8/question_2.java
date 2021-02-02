package assignments.assignment_8;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube();
	}

	public static void cube() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int result = num*num*num;
		System.out.println("The cube of the number: "+result);
		scan.close();
		
	}

}
