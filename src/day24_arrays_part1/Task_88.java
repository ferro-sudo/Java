package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task_88 {

	public static void main(String[] args) {

		int price = 0;

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		String[] cars = { "Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche" };

		System.out.println("Select your car:");
		int indexCar = sc.nextInt();
		String selectedCar = cars[indexCar];

		switch (selectedCar) {
		case "Honda": case "Toyota": case "Nissan":
			price = rn.nextInt((40000 - 20000) + 1) + 20000;
			break;
		case "BMW":	case "Mercedes":
			price = rn.nextInt((80000 - 50000) + 1) + 50000;
			break;
		case "Porsche":	case "Ferrari":
			price = rn.nextInt((150000 - 100000) + 1) + 100000;
			break;
		default:
			System.out.println("Invalid car");

		}
		System.out.println(price);
	}

}
