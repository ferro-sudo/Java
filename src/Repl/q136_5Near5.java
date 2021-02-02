package Repl;

public class q136_5Near5 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 5, 6, 7, 8, 9 };
		boolean flag = false;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);

	}

}
