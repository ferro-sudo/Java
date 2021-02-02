package Repl;

import java.util.ArrayList;

public class q215_2Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> ints){
		ArrayList<Integer> twoInts=new ArrayList<>();
		for (int i=0;i<ints.size();i++) {
			twoInts.add(0, ints.get(ints.size()-i-1));
			twoInts.add(0, ints.get(ints.size()-i-1));
		}
		return twoInts;
	}

}
