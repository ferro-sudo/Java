package day19_StringClass;

import java.util.Scanner;

public class task_75 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first and last name");
		String str =new String(scan.nextLine());
		System.out.println(str.length());
		scan.close();

	}

}
