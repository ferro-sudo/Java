package Repl;

public class q185_BiggerString {

	public static void main(String[] args) {


		biggerS("apple","orange");// ==> "orange"

	}

	public static String biggerS(String a, String b) {


		if(a.length()>b.length()) {
			return a;
		}else {
			return b;
		}
		
	}

}
