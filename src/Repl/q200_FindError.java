package Repl;

public class q200_FindError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isError(String line) 
	  {
	    if(line.startsWith("error")) {
	    	return true;
	    }
	    return false;
	  }

}
