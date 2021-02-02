package day05_unery_assignment_relation;

public class task18_prePostDecrementIncrement {

	public static void main(String[] args) {
		
		int x = 2;
		// System.out.println(x);
		int y = x++;  
		y=x;
		
		System.out.println(x);
		
		System.out.println(y);
		
		int a = 1;
		int result = -a-- + a++ / -a-- * --a;
		System.out.println(a);
		System.out.println(result);
		
		

		

	}

}
