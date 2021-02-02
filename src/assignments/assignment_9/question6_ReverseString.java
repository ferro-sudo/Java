package assignments.assignment_9;

public class question6_ReverseString {

	public static void main(String[] args) {


		String word = "feruh";
		String reverseWord = "";
		
		if(word.length()==5) {
			for (int i=word.length()-1; i>=0 ; i--)
			{
				reverseWord = reverseWord + (word.charAt(i));
				
			}
			System.out.println(reverseWord);
		}else if(word.length()<5) {
			System.out.println("Too short");
		}else if(word.length()>5) {
			System.out.println("Too long");
		}
		
	}

}
