package day15_Method_Part3;

import java.util.Calendar;

public class task67 {

	public static void main(String[] args) {
		yearsUntilRetirement("Ferruh", 1980);
	}
	public static boolean lastDigit(int num1, int num2) {
		if(num1%10==num2%10) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int calculateAge(int yearBirth) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year-yearBirth;
		
		
	}
	public static void yearsUntilRetirement(String name, int year) {
		int retirementAge = 65-calculateAge(year);
		System.out.println(name+" retires in "+retirementAge+" years.");
		
	}
}
