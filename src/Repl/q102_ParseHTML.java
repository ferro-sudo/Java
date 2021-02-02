package Repl;

import java.util.Scanner;

public class q102_ParseHTML {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		if (!html.contains("<html>"))
			System.out.println("Invalid input!");
		else
			System.out.println(html.substring(html.indexOf("id=\"") + 4, html.lastIndexOf("\"")));

	}

}
