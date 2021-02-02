package UtilityMethots;

public class maxValue {

	public static void main(String[] args) {
		System.out.println(maxInt(5, 5, 35, -7));
		System.out.println(maxDouble(35,5,2.3,89,-158));

	}

	public static int maxInt(int... nums) {
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			max = (Math.max(max, i));
		}
		return max;
	}

	public static double maxDouble(double... ds) {
		double max = Double.MIN_VALUE;
		for (int i = 0; i < ds.length; i++)
			max = (max < ds[i]) ? ds[i] : max;
		return max;
	}

}
