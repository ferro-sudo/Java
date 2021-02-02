package Repl;

public class q113_FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 4, 2, 3, -2};
		
		int max=nums[0];
		for(int i:nums)
			if(max<i)
				max=i;
		System.out.println(max);

	}

}
