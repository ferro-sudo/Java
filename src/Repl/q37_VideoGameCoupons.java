package Repl;

import java.util.Scanner;

public class q37_VideoGameCoupons {

	public static void main(String[] args) {

		int numCoupon, candy, gumball;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		numCoupon = sc.nextInt();
		candy=numCoupon/10;
		gumball=numCoupon%10/3;
		
		
		if (numCoupon<3) {
			System.out.println("Not enough coupons");
		}else {
			System.out.println("Number of Candies: "+candy);
			System.out.println("Number of Gumballs: "+gumball);
		}
		sc.close();
	}

}
