package day23_Strings;

public class q13 {

	public static void main(String[] args) {
		
		String word = "cat";

		String newString ="";

		for (int i = 0; i < word.length() ; i++) {
			newString+= word.substring(i, i+1).concat(word.substring(i, i+1));		
		}
		System.out.println(newString);

	}

}
