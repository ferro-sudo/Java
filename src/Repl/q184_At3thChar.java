package Repl;

public class q184_At3thChar {

	public static void main(String[] args) {
		System.out.println(at3("longword","foo"));
		//will return: "lonfoogword"

		at3("blabla","a");
		//will return: "blaabla"

		

	}
	
	public static String at3(String target,String word)
	  {
	    return target.substring(0, 3).concat(word).concat(target.substring(3));
	  }

}
