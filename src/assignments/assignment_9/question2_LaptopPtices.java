package assignments.assignment_9;

import java.util.Scanner;

public class question2_LaptopPtices {

	public static void main(String[] args) {

		int price = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select screen size:1, 2 or 3\n"
				+ "1 )  13.3 inches,  \n"
				+ "2 )  15   inches,  \n"
				+ "3 )  17.3 inches.");
		int screenSize = sc.nextInt();
		
		switch(screenSize) {
		case 1:
			 price += 200;
			 break;
		case 2:
			 price += 300;
			 break;
		case 3:
			 price += 400;
			 break;
		default:
			System.out.println("Invalid entery");
		}
		
		
		System.out.println("Select SPU :1, 2 or 3\n"
				+ "1 )  i3,  \n"
				+ "2 )  i5,  \n"
				+ "3 )  i7.");
		int cpu = sc.nextInt();
		
		switch(cpu) {
		case 1:
			 price += 150;
			 break;
		case 2:
			 price += 250;
			 break;
		case 3:
			 price += 350;
			 break;
		default:
			System.out.println("Invalid entery");
		}
		
		System.out.println("Select RAM size:\n"
				+ "RAM prices will be evaluated for each 4Gb RAM. \n"
				+ "Enter 1, 2, 3 and so...");
			
		int ram = sc.nextInt();
		
		if (ram>0) {
			price+= ram*50;
			
		}
		
		System.out.println("Select your storage type:\n"
				+ "1 )  HDD,  \n"
				+ "2 )  SSD.");
			
		int hardDrive = sc.nextInt();
		
		System.out.println("Select your storage size:\n"
				+ "Storage prices will be evaluated for each 500Gb . \n"
				+ "Enter 1, 2, 3 and so...");
			
		int memorysize = sc.nextInt();
		
		if (hardDrive==1) {
			price+= memorysize*50;
		}else if(hardDrive==2) {
			price+= memorysize*100;
		}
		
		
		
		
		System.out.println("Select screen resolution:1 or 2\n"
				+ "1 )  FULLHD,  \n"
				+ "2 )  4K.");
		int screenRes = sc.nextInt();
		
		switch(screenRes) {
		case 1:
			 price += 100;
			 break;
		case 2:
			 price += 200;
			 break;		
		default:
			System.out.println("Invalid entery");
		}
		System.out.println("Laptop price is: $"+price);
		sc.close();

	}
	
	

}
