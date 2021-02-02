package day19_StringClass;

import java.util.Scanner;

public class task_82 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your username and password!\n"
				+ "username: ");
		
		String user = scan.nextLine();
		System.out.print("password: ");
		String pass = scan.nextLine();
		String userNameInSystem = "Mike";
		String passwordInSystem = "123";
		
		if(user.equals("")&&pass.equals("")) {
			System.out.println("UserName and Password Field cannot be empty");
		}else if(user.equals("")&&pass.length()>0) {
			System.out.println("UserName cannot be empty");
		}else if(!user.equals("") && pass.equals("")) {
			System.out.println("Password can not be empty");
		}else if(!user.equals(userNameInSystem) || ! pass.equals(passwordInSystem)) {
			System.out.println("Username or password not valid, please verify");
		}else if(user.equals(userNameInSystem) && pass.equals(passwordInSystem)) {
			System.out.println("User logged in  successfully");
		}
		scan.close();

	}

}
