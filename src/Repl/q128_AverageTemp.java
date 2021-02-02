package Repl;

public class q128_AverageTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = {80,88,88,84,82,78,60,68};
		
		for(double d:temps) 
			total+=d;
		avgTemp=total/temps.length;
		System.out.println(avgTemp);
	}

}
