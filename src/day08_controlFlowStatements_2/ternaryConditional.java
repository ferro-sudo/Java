package day08_controlFlowStatements_2;

public class ternaryConditional {

	public static void main(String[] args) {
		
		int bill = 3000;
		System.out.println("Total: "+bill);
		
		double discount = (bill>1000) ? (bill>2000) ? (bill*0.2) : (bill*0.15) : (bill*0.1) ;
		System.out.println("Discount: "+discount);
		
		System.out.println("your bill is "+ (bill-discount));
		
	}

}
