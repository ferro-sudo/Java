package day27_arrays_part4;

public class task95_2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] scores= {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
			int[] student1 = scores[0].clone();
			int sum=0;
			for(int i:student1) {
				sum+=i;
				
			}
			System.out.println(sum/student1.length);
			
			int math=scores[0][0]+scores[1][0]+scores[2][0];
			
			System.out.println(math);
	}

}
