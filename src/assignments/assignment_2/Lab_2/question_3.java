package assignments.assignment_2.Lab_2;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nonzero integer value:");
		int num= sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}System.out.println(sum);
		sc.close();

	}

}
