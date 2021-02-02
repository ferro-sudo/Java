package assignments.assignment_5;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		
		System.out.println("Upper bound?");
		int n =new Scanner(System.in).nextInt();
		
		int i=0;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.print(i);
				if(i<n-1) {
					System.out.print(",");
				}
			}
			i++;
			
			
		}
		
		

	}

}
