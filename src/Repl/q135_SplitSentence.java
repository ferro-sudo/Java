package Repl;

public class q135_SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence ="Java is fun";
		
		String[] words=sentence.split(" ");
		for(String s:words)
			System.out.println(s);
	}

}
