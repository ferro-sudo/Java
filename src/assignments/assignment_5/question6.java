package assignments.assignment_5;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Iteration times:");
		int n=s.nextInt();
		int fibo1=0;
		int fibo2=1;
		for (int i=0;i<n;i++) {
						
			System.out.print(fibo1+",");
			int sum=fibo1+fibo2;
			fibo1= fibo2;
			fibo2=sum;
			
		}
		s.close();
		
	}

}
