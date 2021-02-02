package assignments.assignment_9;

public class question3_WordManipulations {

	public static void main(String[] args) {

		String word = "Cybertek";
		
		if(word.length()%2!=0) {
			System.out.println(word.charAt(word.length()/2));
		}else if(word.length()==1) {
			System.out.println(word+word+word);
		}else if(word.length()%2==0&&word.length()>=4) {
			System.out.println(word.substring(word.length()/2-1, word.length()/2+1));
		}else if(word.length()==2) {
			System.out.println(word+word);
		}

	}

}
