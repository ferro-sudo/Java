package Repl;

import java.util.Scanner;

public class q78_CarInsurance {

	public static void main(String[] args) {

		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		int zipCode = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String hasDrivingLicense = scan.next();
		boolean concentDrivingLicience = (hasDrivingLicense.equalsIgnoreCase("yes")) ? true : false;
		if (concentDrivingLicience == false) {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		while (true) {
			System.out.println("Enter your zip code");
			zipCode = scan.nextInt();
			if (zipCode < 10000)
				continue;
			if (zipCode == 20910 || zipCode == 20740)
				premium += 60;
			else if (zipCode == 22102 || zipCode == 22103)
				premium += 30;
			else
				premium += 50;
			break;
		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		if (vehicleOwnership.equalsIgnoreCase("owned"))
			premium += 10;
		else
			premium += 20;

		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next().toLowerCase();
		switch (vehicleUsage) {
		case "business":
			premium += 50;
			break;
		case "pleasure":
			premium += 10;
			break;
		case "commute":
			premium += 20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium += daysDrivenToWorkOrSchool * 5;
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium += milesToWorkOrSchool;
			break;
		default:
			break;
		}

		System.out.println("How old are you?");
		int age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (age >= 16 && age < 18)
			premium *= 20;
		else if (age >= 18 && age <= 21)
			premium *= 6;
		else if (age > 21 && age < 25)
			premium *= 2;

		System.out.println("How many years you've been driving?");
		int driveExperience = scan.nextInt();
		if (driveExperience != 0 && age - driveExperience < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else {
			premium -= driveExperience * 5;
		}

		System.out.println("Have you had any accidents in the last 5 years?");
		String isAccident = scan.next().toLowerCase();
		if (isAccident.equals("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium += (premium * 0.20) * accidentsAmount;
		}

		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next().toLowerCase();
		if (continuousInsurance.equals("no"))
			premium *= 2;

		scan.nextLine();

		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine().toLowerCase();

		if (education.equals("phd") || education.equals("bachelors") || education.equals("masters"))
			premium -= premium * 0.05;
		else if (education.equals("doctors"))
			premium -= premium * 0.10;
		else if (education.equals("less than high school"))
			premium += premium * 0.05;

		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode
				+ (education.replace(" ", ""));
		System.out.println("Reference number: " + referenceNumber.toUpperCase());

	}

}
