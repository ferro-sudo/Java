package day19_StringClass;

public class task79_Vowels {

	public static void main(String[] args) {


		String word = "CybertekSchool";
		
		
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if (ch=='a'||word.charAt(i)=='e'||ch=='o'||ch=='i'||ch=='u') {
				System.out.print(ch);
				if(i!=word.length()-2) {
					System.out.print(",");
				}
			}
			
		}

	}

}
