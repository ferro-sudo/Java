package assignments.assignment_2.Lab_2;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int numFirst=sc.nextInt();
		System.out.print("Enter your next number:");
		int numNext=sc.nextInt();
		int max=Math.max(numFirst, numNext);
		int min=Math.min(numFirst, numNext);
		System.out.print("Do you want to add an other number: 0-No, 1-Yes");
		int concent = sc.nextInt();
		
		while(concent==1) {
			System.out.print("Enter your next number:");
			numNext=sc.nextInt();
			max=Math.max(max, numNext);
			min=Math.min(min, numNext);
			System.out.print("Do you want to add an other number: 0-No, 1-Yes");
			concent = sc.nextInt();
		}
		if (concent==0) {
			System.out.println("Smallest number is:"+min);
			System.out.println("Largest number is:"+max);
			
		}else {
			System.out.println("Invalid entery");
			
			
		}
		sc.close();
	}

}
