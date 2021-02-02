package day24_arrays_part1;

import java.util.Arrays;

public class Task92 {

	public static void main(String[] args) {


		int[] numbers= new int[10];
		
		for(int i=1;i<=numbers.length;i++)
			numbers[i-1]=i*19;
		for(int i:numbers)
			System.out.println(i);
		
		System.out.println(Arrays.toString(numbers));

	}

}
