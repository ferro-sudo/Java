package assignments.assignment_2.Lab_2;

import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of males:");
		double males= sc.nextInt();
		System.out.print("Enter number of females:");
		double females= sc.nextInt();
		double sum=males+females;
		System.out.println("Percentage of males is: %"+(int)((males/sum)*100));
		System.out.println("Percentage of females is: %"+(int)((females/sum)*100));
		sc.close();

	}

}
