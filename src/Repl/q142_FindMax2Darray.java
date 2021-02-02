package Repl;

public class q142_FindMax2Darray {

	public static void main(String[] args) {

		int[][] arr = {{1,4,56,73,23,45},{4,-34,-2,65},{3,5,7,23,87,45}};
		int max=arr[0][0];
		for(int[] inner:arr) {
			for(int nums:inner) {
				if(max<nums)
					max=nums;
			}
		}
		System.out.println(max);
	}

}
