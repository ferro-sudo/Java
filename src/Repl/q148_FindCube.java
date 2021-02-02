package Repl;

import java.util.Scanner;

public class q148_FindCube {
	
	public static void cube()
	  {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a positive integer:");
	    int num=scan.nextInt();
	    int cube = num*num*num;
	    System.out.println(cube);
	    scan.close();
	  }//end cube
	  
	  public static void main(String[] args) {
	    
	    cube();
	   
	  }

}
