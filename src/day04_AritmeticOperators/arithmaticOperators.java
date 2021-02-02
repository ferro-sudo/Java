package day04_AritmeticOperators;

public class arithmaticOperators {

	public static void main(String[] args) {
		
		System.out.println(55+5);
		int chairs=140;
		System.out.println(chairs+2);
		//chairs= chairs+2;
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		int tables= 130;
		int total= tables+chairs;
		System.out.println(total);
		
		//Subtraction
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance- transaction;
		System.out.println(balance);
		
		int linesOfCode = 50;
		System.out.println("Lines of code "+linesOfCode);
		System.out.println("Lines of code "+(linesOfCode-2));
		
		// multiplication
		
		int classes = 5;
		System.out.println(linesOfCode* classes);
		int totalLinesOfCode= linesOfCode * classes;
		System.out.println("Total Lines of Codes = " + totalLinesOfCode);
		
		// Division
		System.out.println(10/3);
		System.out.println(60/3);
		
		//remainder
		System.out.println(10%2);
		System.out.println(9%2);
		
		
	}
	

}
