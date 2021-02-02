package Repl;

public class q190_MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7 };
		for (int i : mergR(arr1, arr2))
			System.out.println(i);

	}

	public static int[] mergR(int[] a, int[] b) {
		int[] mergedArr = new int[a.length + b.length];
		int z = 0;
		for (int i = 0; i < a.length; i++, z++) {
			mergedArr[i] = a[i];
		}
		for (int i = 0; i < b.length; i++, z++) {
			mergedArr[z] = b[i];
		}
		return mergedArr;

	}

}
