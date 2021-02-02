package Repl;

import java.util.Scanner;

public class q104_ParseJSON {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		
		String[]str=json.split(",");
		
		System.out.println("First name: "+str[1].substring(str[1].indexOf("\"", 14)+1, str[1].lastIndexOf("\"")));
		System.out.println("Last name: "+str[2].substring(str[2].indexOf("\"", 12)+1, str[2].lastIndexOf("\"")));


		
	}

}
 