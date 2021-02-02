 package assignments.assignment_9;

public class question1_TipCalculator {

	public static void main(String[] args) {


		tipCalculator(true,5,500,"fair");

	}

	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {


		double totPerPerson=0;
		double tip=0;
		
		switch(serviceQuality.toLowerCase()) {
		case "excellent":
			tip = checkAmount*25/100;
			break;
		case "great":
			tip = checkAmount*0.20;
			break;
		case "good":
			tip = checkAmount*0.15;
			break;
		case "fair":
			tip = checkAmount*0.10;
			break;
		case "poor":
			tip = checkAmount*0.5;
			break;
		}
		
		if (isSplit) {
			totPerPerson=checkAmount/numberPeople;
			System.out.print("Number of people entered: ");
			for (int i= 1;i<=numberPeople;i++ ) {
				System.out.print("&");
				
			}System.out.println();
			System.out.println("Total to pay: "+(checkAmount+tip));
			System.out.println("Total tip: "+ tip);
			System.out.println("Total per person: "+(totPerPerson+tip/numberPeople));
			System.out.println("Tip per person: "+(tip/numberPeople));
		}else  {
			System.out.print("Number of people entered: ");
			for (int i= 1;i<=numberPeople;i++ ) {
				System.out.print("&");
				
			}System.out.println();
			System.out.println("Total to pay: "+(checkAmount+tip));
			System.out.println("Total tip: "+ tip);
			
			
		}
		
		
	}

}
