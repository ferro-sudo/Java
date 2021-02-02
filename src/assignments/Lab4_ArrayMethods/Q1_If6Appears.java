package assignments.Lab4_ArrayMethods;

public class Q1_If6Appears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,6,5};
		System.out.println(if6Appears(nums));

	}
	
	public static boolean if6Appears(int[] arr) {
		
		for(int i:arr) 
			if(i==6) 
				return true;	
		
		return false;
		
	}

}
