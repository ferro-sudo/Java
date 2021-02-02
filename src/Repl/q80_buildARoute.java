package Repl;

import java.util.Scanner;

public class q80_buildARoute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();

		String right = "right";
		String left = "left";
		String down = "down";
		String up = "up";

		if (start.equalsIgnoreCase(end) && end.equalsIgnoreCase(start)) {
			System.out.println(end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")) {
			System.out.println(right + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")) {
			System.out.println(right + " > " + down + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")) {
			System.out.println(right + " > " + down + " > " + left + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")) {
			System.out.println(down + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")) {
			System.out.println(down + " > " + left + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")) {
			System.out.println(down + " > " + left + " > " + up + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")) {
			System.out.println(left + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")) {
			System.out.println(left + " > " + up + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B")) {
			System.out.println(left + " > " + up + " > " + right + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A")) {
			System.out.println(up + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")) {
			System.out.println(up + " > " + right + ": " + end.toUpperCase() + " found");
		} else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C")) {
			System.out.println(up + " > " + right + " > " + down + ": " + end.toUpperCase() + " found");
		}
		scan.close();

	}

}
