package day30_WrapperClasses;

public class Task97 {

	public static void main(String[] args) {


		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av'''~a777.||}{";
		alfabetic(s);
		

	}
	
	public static void alfabetic(String str) {
		String temp="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))||str.charAt(i)==' '){
				temp+=str.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
