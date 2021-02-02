package assignments.assignment_5;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		
		System.out.println("Upper bound?");
		int n =new Scanner(System.in).nextInt();
		int sum=0;
		int i=1;
		while(i<=n)
		{			
			sum+=i;	
			i++;
		}
		System.out.println(sum);
		

	}

}
