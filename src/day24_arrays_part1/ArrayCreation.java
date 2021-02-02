package day24_arrays_part1;

public class ArrayCreation {

	public static void main(String[] args) {

		int sum=0;
		int[] scores= {80,90,100,25,65,84,65,78,92,63};
		for(int i:scores) 
			sum+=i;				
		System.out.println("Avarage: "+sum/scores.length);
		
		String[] cars = { "Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche" };
		
		for(String s:cars) {
			if(s.equals("Honda")) {
				System.out.println("I found your car Honda in this array");
				break;
			}
			else {
				System.out.println("I could'n find your car Honda in this array");
				break;
			}
		}

	}

}
