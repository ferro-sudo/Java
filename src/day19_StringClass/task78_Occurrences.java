package day19_StringClass;

public class task78_Occurrences {

	public static void main(String[] args) {


		String word = "abcabqcabc";
		char ch ='x';
		int numOfChar=0;
		
		for(int i=0;i<word.length();i++) {
			if (ch==word.charAt(i)) {
				numOfChar++;
			}
			
		}System.out.println("Number of "+ch+" in this string is: "+numOfChar);
	}

}
