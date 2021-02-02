package Repl;

import java.util.Scanner;

public class q154_isPos {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Size?");
	    int size = inp.nextInt();
	    System.out.println("Put the numbers!");
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    //#2 Your code here
	    for(int i=0;i<arr.length;i++) {
	    isPos(arr[i]);
	    }
	    inp.close();
	  
	  }
	  
	  public static void isPos(int num)
	  {
	    if(num>=0) {
	    	System.out.println("positive");
	    }else {
	    	System.out.println("negative");
	    }
	   
	  }

}
