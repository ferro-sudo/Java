package Repl;

public class q64_1_MiddleOne {

	public static void main(String[] args) {

		String word = "####";
		
		if(word.length()%2==0) {
			if(word.length()==2)
				System.out.println(word+word);
			else {
				String sub=word.substring(word.length()/2-1, word.length()/2+1);
				System.out.println(sub);
			}
		}else {
			if(word.length()==1)
				System.out.println(word+word+word);
			else
				System.out.println(word.substring(word.length()/2, word.length()/2+1));
		}

	}

}
