package assignments.assignment_5;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter an integer number:");
		int num = s.nextInt();
		int result = 0;
		int i=0;
		
		while(i<100) {
			result=num*10;
			num=result;
			i+=result;
			System.out.println(result);
		}
		s.close();
		
		

	}

}
