package day19_StringClass;

public class String_charAt {

	public static void main(String[] args) {


		String word= "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		String word2 = "Apple";
		if (word2.charAt(0)=='A'){
		System.out.println("A is first character");
		}else{
			System.out.println("A is first character");
		}
		
		String word3 = "civic";
		if (word3.charAt(0)==word3.charAt(word3.length()-1)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
