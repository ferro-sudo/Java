package UtilityMethots;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/*For example 2000 is leap year or 1998 is not leap year. 
		 *  Use that method inside different method to get all leap years in one shot.
		before meeting solve the question as a group. And each group is going to have 
		one speaker to explain their own solution to us.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("enter start year");
		int startYear=scan.nextInt();
		
		System.out.println("enter current year");
		int year=scan.nextInt();		
		
		for(int i=startYear;i<=year;i++) {		
		
		if((i%4)==0) {
			System.out.println(i+" is a leap year");
		}
		}

	}

}
