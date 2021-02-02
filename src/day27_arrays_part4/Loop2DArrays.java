package day27_arrays_part4;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers = {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.println(numbers[i][j]);
			}
		}
		for(int[]i:numbers)
			for(int j:i)
			System.out.print(j);

	}

}
