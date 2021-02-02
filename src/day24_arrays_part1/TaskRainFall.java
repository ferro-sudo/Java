package day24_arrays_part1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TaskRainFall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] rainfall= new double[12];
		
		
		getValues(rainfall);
		
		totalRainFall(rainfall);
		avarageRainFall(rainfall);
		mostRainyMonth(rainfall);
		leastRainyMonth(rainfall);

	}

	public static void leastRainyMonth(double[] rainfall) {
		// TODO Auto-generated method stub
		double min=rainfall[0];
		for(int i=0;i<rainfall.length;i++)
			if(min<rainfall[i])
				min=rainfall[i];
		
		System.out.println("The min rain is: "+min+" inches");
		
	}

	public static void mostRainyMonth(double[] rainfall) {
		// TODO Auto-generated method stub
		double max=rainfall[0];
		for(int i=0;i<rainfall.length;i++)
			if(max>rainfall[i])
				max=rainfall[i];
		
		System.out.println("The max rain is: "+max+" inches");
		
	}

	public static void avarageRainFall(double[] rainFall) {
		// TODO Auto-generated method stub
		double average;
		average=sumRainFall(rainFall)/rainFall.length;
		System.out.println("The average rainfall was: "+average+" inches");
		
	}

	public static void totalRainFall(double[] rainFall) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<rainFall.length;i++)
			sum+=rainFall[i];
		System.out.println("The sum of all the rain is: "+sum+" inches");
				
	}
	
	public static double sumRainFall(double[] rainFall) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<rainFall.length;i++)
			sum+=rainFall[i];
		return sum;
	}

	public static void getValues(double[] rainFall) {
		// TODO Auto-generated method stub
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month Rainfall (In inches)");
		Scanner sc =new Scanner(System.in);
		for (int i=0;i<months.length;i++) {
			System.out.print(months[i]+" :");
			rainFall[i]=sc.nextDouble();
		}
		
	}
	
	

}
