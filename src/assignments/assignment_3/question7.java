package assignments.assignment_3;

public class question7 {
	
	public static void main(String[] args) {
		
		int price = 10;
		int change= 100-price;
		int quarters, dimes, nickels;
		
		
	    quarters = change/25;
	    change = change%25;
	    dimes = change/10;
	    change = change%10;
	    nickels = change/5;
	    //change = change%5;
	    
		
		
		System.out.println("Your change is "+quarters+" quartes "+dimes+" dimes, and "+nickels+" nickels");
		
		
		
		
	}

}
