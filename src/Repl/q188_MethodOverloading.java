package Repl;

public class q188_MethodOverloading {

	public static void main(String[] args) {
		int[] arr = { 90, 10, 5, 3, 5, 9, 7, 6, 85 };
		double[] arrd = { 10.2, 56.5, 9.8, 48, 12.6 };
		findMax(arr);
		findMax(arrd);

	}

	public static double findMax(double[] arrd) {
		double max = 0;
		double temp = 0;
		for (int i = 0; i < arrd.length - 1; i++) {
			temp = Math.max(arrd[i], arrd[i + 1]);
			max = Math.max(max, temp);
		}
		return max;

	}

	public static int findMax(int arr[]) {
		int max = 0;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			temp = Math.max(arr[i], arr[i + 1]);
			max = Math.max(max, temp);
		}
		return max;

	}

}
