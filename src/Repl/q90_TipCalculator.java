package Repl;

import java.util.Scanner;

public class q90_TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totPerPerson=0;
		double tip=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Split:");
		String split = s.next();
		
		
		System.out.println("Number of people:");
		int numPeople = s.nextInt();
		
		System.out.println("Check amount:");
		double check = s.nextDouble();
		
		System.out.println("Service Quality:");
		String serQual = s.next();
		switch(serQual.toLowerCase()) {
		case "excellent":
			tip = check*25/100;
			break;
		case "great":
			tip = check*0.20;
			break;
		case "good":
			tip = check*0.15;
			break;
		case "fair":
			tip = check*0.10;
			break;
		case "poor":
			tip = check*0.5;
			break;
		}
		
		if (split.toLowerCase().equals("yes")) {
			totPerPerson=check/numPeople;
		}else if(split.toLowerCase().equals("no")) {
			totPerPerson=0;
		}
		System.out.print("Number of people entered: ");
		for (int i= 1;i<=numPeople;i++ ) {
			System.out.print("&");
			
		}System.out.println();
		System.out.println("Total to pay: "+(check+tip));
		System.out.println("Total tip: "+ tip);
		System.out.println("Total per person: "+(totPerPerson+tip/numPeople));
		System.out.println("Tip per person: "+(tip/numPeople));
		s.close();
	}

}
