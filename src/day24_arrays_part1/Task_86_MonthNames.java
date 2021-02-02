package day24_arrays_part1;

import java.util.Scanner;

public class Task_86_MonthNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mounth index");
		int index =sc.nextInt();


		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.println("The mounth name is "+months[index-1]);
		for (String s:months)
			System.out.println(s);

	}

}
