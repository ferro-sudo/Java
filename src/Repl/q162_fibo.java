package Repl;

import java.util.Scanner;

public class q162_fibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
		  int fibo1=0;
			int fibo2=1;
			for (int i=0;i<num;i++) {				
				int sum=fibo1+fibo2;
				fibo1= fibo2;
				fibo2=sum;
				
			}System.out.println(fibo1);
	  }

}
