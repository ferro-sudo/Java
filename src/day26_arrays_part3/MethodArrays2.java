package day26_arrays_part3;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {

		System.out.println(findCar(2, "Honda"));

	}

	public static String[] createMethod(int arraySize) {
		// TODO Auto-generated method stub
		String[] carArray = new String[arraySize];

		Scanner sc = new Scanner(System.in);
		for (int i=0;i<carArray.length;i++) {
			System.out.print("Enter car name: ");
			carArray[i] = sc.next();
		}
		return carArray;

	}

	public static boolean findCar(int size, String carName) {
		// TODO Auto-generated method stub
		
		for (String value : createMethod(size)) {
			if (value.equalsIgnoreCase(carName)) {
				return true;
				

			}
		}
		return false;

	}

}
