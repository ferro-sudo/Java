package assignments.assignment_9;

public class question7_DoubleHalf {

	public static void main(String[] args) {

		String word = "java";
		String doubleHalf = "";
		
		doubleHalf=word.substring(0, word.length()/2);
		System.out.println(doubleHalf+doubleHalf);

	}

}
