package day06_logocal_operators;

public class Task23 {

	public static void main(String[] args) {
		
		double d1 = 20;
		double d2 = 80;
		
		double res = (d1+d2)*25;
		
		double remainder = res%40;
		
		System.out.println("Ramaining total is equal to 20 or less? - " + (remainder<=20));

	}

}
