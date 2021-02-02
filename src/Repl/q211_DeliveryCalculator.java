package Repl;

import java.util.ArrayList;

public class q211_DeliveryCalculator {

	public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
		int refuelTimes = 0;
		double sum = 0;
		for (int i = 0; i < deliveries.size(); i++) {
			sum += deliveries.get(i);
		}		
		refuelTimes = (int) Math.ceil(sum/max_fuel);
		return refuelTimes;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(6);
		int times = refuel_times(arr, 3);
		System.out.print(times);// should output 5
		double d= 5/3;
		System.out.println(d);

	}// end main

}
