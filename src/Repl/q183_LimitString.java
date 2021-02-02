package Repl;

public class q183_LimitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(limit("agdghg", 3));
	}
	
	public static String limit(String text, int maxLength)
	  {
	    return text.substring(0, maxLength);
	  }

}
