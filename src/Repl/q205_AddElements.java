package Repl;

public class q205_AddElements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 6, 7, 8, 9 };
		for (int i : addElements(arr1, arr2))
			System.out.println(i);

	}

	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] sumArr=new int[5];
		for(int i=0;i<5;i++) {
			sumArr[i]=ints1[i]+ints2[i];
		}
		return sumArr;

	}

}
