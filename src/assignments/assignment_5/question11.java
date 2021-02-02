package assignments.assignment_5;

public class question11 {

	public static void main(String[] args) {
				
		for(int i=4;i>=1;i--) {				
			for(int k = 1; k <= 4 - i; k++) {
                System.out.print("  ");
            }				
			for(int j=i;j>=1;j--) {				
				System.out.print(j+"   ");				
			}				
			System.out.println();			
		}

	}

}
