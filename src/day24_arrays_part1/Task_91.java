package day24_arrays_part1;

import java.util.Random;

public class Task_91 {

	public static void main(String[] args) {
		
		Random rn=new Random();


		int[] arr=new int[10];
		for(int i:arr) {
			i=rn.nextInt(100);
			System.out.println(i);
		}

	}

}
