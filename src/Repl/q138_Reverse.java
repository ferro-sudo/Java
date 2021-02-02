package Repl;

public class q138_Reverse {

	public static void main(String[] args) {
		String sentence = "Java is fun";
	    
	    String reversed = "";
	    //TODO: start your code here
	    String[] s=sentence.split(" ");
	    for(int i=s.length-1;i>=0;i--) 
	    	reversed+=s[i]+" ";
	    
	    
	    
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed.trim());

	}

}
