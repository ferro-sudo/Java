package day32_ArrayList_part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<>();

		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		numsList.add(10);

		printList(numsList);
		System.out.println();

		Collection<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(5.56);

		double sum = sumList(doubleList);
		System.out.println(String.format("%.2f", sum));

		ArrayList<Integer> list = getList(15);
		System.out.println(list);

		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList);

	}

	public static ArrayList<Integer> getRandomList(int size) {
		ArrayList<Integer> randmList = new ArrayList<>();
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			randmList.add(rd.nextInt(101));
		}

		return randmList;
	}

	public static ArrayList<Integer> getList(int i) {

		ArrayList<Integer> arrList = new ArrayList<>(i);
		for (int j = 0; j < i; j++) {
			arrList.add(j, j + 1);
		}
		return arrList;
	}

	public static double sumList(Collection<Double> doubles) {
		double sum = 0;

		for (Double d : doubles)
			sum += d;
		return sum;
	}

	public static void printList(ArrayList<Integer> nums) {

		for (Integer i : nums)
			System.out.print(i + " ");

	}

}
