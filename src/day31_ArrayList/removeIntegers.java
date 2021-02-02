package day31_ArrayList;

import java.util.ArrayList;

public class removeIntegers {

	public static void main(String[] args) {


		ArrayList<String> cities= new ArrayList<>();
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Istanbul");
		cities.add("Virginia");
		
		for(String s:cities) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		for(int i=0;i<cities.size();i++)
			System.out.print(cities.get(i)+" ");
		System.out.println();
		
		System.out.println(cities);
		
		boolean b=cities.indexOf("Virginia")==1;
		System.out.println(b);

	}

}
