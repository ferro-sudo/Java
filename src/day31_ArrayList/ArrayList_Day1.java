package day31_ArrayList;

import java.util.ArrayList;

public class ArrayList_Day1 {

	public static void main(String[] args) {


		ArrayList<String> languages = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		languages.add("Turkish");
		languages.add("Greek");
		languages.add("Arabic");
		System.out.println("Number of values: "+languages.size());
		System.out.println(languages.get(0));
		System.out.println(languages.toString());

	}

}
