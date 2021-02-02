package Repl;



public class q137_ReverseSentence {

	public static void main(String[] args) {
		String sentence = "Java is fun";
		
		String[] str=sentence.split(" ");
		
		for(int i=1;i<=str.length;i++ ) {
			System.out.println(str[str.length-i]);
		}

	}

}
