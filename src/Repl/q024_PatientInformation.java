package Repl;
import java.util.Scanner;

public class q024_PatientInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int  age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.println("Enter your first name");
		firstName = scan.nextLine();
		scan.nextLine();
		
		System.out.println("Enter your last name");
		lastName = scan.nextLine();
		scan.nextLine();
		
        System.out.println("Enter your email");
        email = scan.nextLine();
        scan.nextLine();
        
        System.out.println("Enter your street");
        street = scan.nextLine();
        scan.nextLine();
        
        System.out.println("Enter your city");
        city = scan.nextLine();
        scan.nextLine();
        
        System.out.println("Enter your state");
        state = scan.nextLine();
        scan.nextLine();
        
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        scan.nextLine();
        
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        scan.nextLine();
        
        System.out.println("Enter your age");
        age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter your height");
        height = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        scan.nextLine();
        
        fullName = "Full name: "+firstName+", "+lastName;
        address = "Address: "+street+", "+city+", "+state+", "+zipcode;
        contacts = "Contacts: "+"work phone number - " +workPhoneNumber+ ", personal phone number - " +personalPhoneNumber+ ", email: "+email;
        
        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contacts);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+isMarried);
        
     scan.close();
	}

}
