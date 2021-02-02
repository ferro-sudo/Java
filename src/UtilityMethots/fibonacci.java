package UtilityMethots;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper bound: ");
		int upperBound=sc.nextInt();
		
		
		int fibo1=0;
		int fibo2=1;
		int sumTemp;
		
		for(int i=1;i<=upperBound;i++) {
			sumTemp=fibo1+fibo2;
			System.out.print(fibo1+" ");
			fibo1=fibo2;
			fibo2=sumTemp;
			
			
			
		}
		

		
	}

}
